package com.agelousis.materialsearchview.extensions

import android.animation.Animator
import android.content.Context
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.LinearInterpolator
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import androidx.databinding.BindingAdapter
import java.io.File

fun AppCompatImageView.setAnimatedImageResourceId(resourceId: Int?) {
    resourceId?.let {
        post {
            animate().alpha(0.0f).setInterpolator(LinearInterpolator()).setListener(
                object: Animator.AnimatorListener {
                    override fun onAnimationCancel(p0: Animator?) {}
                    override fun onAnimationRepeat(p0: Animator?) {}
                    override fun onAnimationStart(p0: Animator?) {}
                    override fun onAnimationEnd(p0: Animator?) {
                        setImageResource(it)
                        animate().alpha(1.0f).interpolator = LinearInterpolator()
                    }
                }
            )
        }
    }
}

fun View.infiniteAlphaAnimation(state: Boolean) {
    if (state) {
        if (animation == null)
            startAnimation(
                AlphaAnimation(0.0f, 1.0f).also {
                    it.repeatMode = AlphaAnimation.REVERSE
                    it.repeatCount = AlphaAnimation.INFINITE
                    it.duration = 1500
                    it.interpolator = LinearInterpolator()
                }
            )
    }
    else {
        if (animation != null) {
            alpha = 1.0f
            clearAnimation()
        }
    }
}

fun Context.initializeField(appCompatEditText: AppCompatEditText) {
    appCompatEditText.requestFocus()
    (getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager)?.showSoftInput(
        appCompatEditText,
        InputMethodManager.SHOW_FORCED
    )
}

fun Drawable.fromVector(padding: Int): Bitmap {
    val bitmap = Bitmap.createBitmap(this.intrinsicWidth, this.intrinsicHeight, Bitmap.Config.ARGB_8888)
    val canvas = Canvas(bitmap)
    this.setBounds(padding, padding, canvas.width - padding, canvas.height - padding)
    this.draw(canvas)
    return bitmap
}

fun AppCompatImageView.calculateInSampleSize(file: File? = null, byteArray: ByteArray? = null, resource: Pair<Resources, Int>? = null): Int {
    val options = BitmapFactory.Options()
    options.inJustDecodeBounds = true
    val bitmap = file?.let {
        BitmapFactory.decodeFile(it.absolutePath, options)
    } ?: byteArray?.let {
        BitmapFactory.decodeByteArray(it, 0, it.size, options)
    } ?: resource?.let {
        BitmapFactory.decodeResource(it.first, it.second, options)
    } ?: return 0
    // Raw height and width of image
    val (height: Int, width: Int) = options.run { outHeight to outWidth }
    var inSampleSize = 1

    if (height > height * 2 || width > width * 2) {

        val halfHeight: Int = height / 2
        val halfWidth: Int = width / 2

        // Calculate the largest inSampleSize value that is a power of 2 and keeps both
        // height and width larger than the requested height and width.
        while (halfHeight / inSampleSize >= height * 2 && halfWidth / inSampleSize >= width * 2) {
            inSampleSize *= 2
        }
    }

    return inSampleSize
}

@BindingAdapter("imageFromResourceId")
fun setImageFromResourceId(appCompatImageView: AppCompatImageView, resourceId: Int?) {
    resourceId?.let {
        val bitmap = BitmapFactory.decodeResource(
            appCompatImageView.context.resources,
            it,
            BitmapFactory.Options().also { options ->
                options.inSampleSize = appCompatImageView.calculateInSampleSize(
                    resource = appCompatImageView.context.resources to it
                )
            }
        )
        appCompatImageView.setImageDrawable(
            RoundedBitmapDrawableFactory.create(
                appCompatImageView.context.resources,
                bitmap
            ).also { roundedBitmapDrawable ->
                roundedBitmapDrawable.isCircular = true
            }
        )
    }
}

@BindingAdapter("imageFromByteArray")
fun setImageFromByteArray(appCompatImageView: AppCompatImageView, byteArray: List<Byte>?) {
    byteArray?.toByteArray()?.let {
        val bitmap = BitmapFactory.decodeByteArray(
            it,
            0,
            it.size,
            BitmapFactory.Options().also { options ->
                options.inSampleSize = appCompatImageView.calculateInSampleSize(
                    byteArray = it
                )
            }
        )
        appCompatImageView.setImageDrawable(
            RoundedBitmapDrawableFactory.create(
                appCompatImageView.context.resources,
                bitmap
            ).also { roundedBitmapDrawable ->
                roundedBitmapDrawable.isCircular = true
            }
        )
    }
}

@BindingAdapter("imageFromFile")
fun setImageFromFile(appCompatImageView: AppCompatImageView, file: File?) {
    file?.let {
        val bitmap = BitmapFactory.decodeFile(
            it.absolutePath,
            BitmapFactory.Options().also { options ->
                options.inSampleSize = appCompatImageView.calculateInSampleSize(
                    file = it
                )
            }
        )
        appCompatImageView.setImageDrawable(
            RoundedBitmapDrawableFactory.create(
                appCompatImageView.context.resources,
                bitmap
            ).also { roundedBitmapDrawable ->
                roundedBitmapDrawable.isCircular = true
            }
        )
    }
}

@BindingAdapter("imageFromVectorResourceId")
fun setImageFromVectorResourceId(appCompatImageView: AppCompatImageView, vectorResourceId: Int?) {
    vectorResourceId?.let {
        val bitmap = ContextCompat.getDrawable(appCompatImageView.context, it)?.fromVector(padding = 0) ?: return@let
        appCompatImageView.setImageDrawable(
            RoundedBitmapDrawableFactory.create(
                appCompatImageView.context.resources,
                bitmap
            ).also { roundedBitmapDrawable ->
                roundedBitmapDrawable.isCircular = true
            }
        )
    }
}

@BindingAdapter("imageFromBitmap")
fun setImageFromBitmap(appCompatImageView: AppCompatImageView, bitmap: Bitmap?) {
    bitmap?.let {
        appCompatImageView.setImageDrawable(
            RoundedBitmapDrawableFactory.create(
                appCompatImageView.context.resources,
                it
            ).also { roundedBitmapDrawable ->
                roundedBitmapDrawable.isCircular = true
            }
        )
    }
}