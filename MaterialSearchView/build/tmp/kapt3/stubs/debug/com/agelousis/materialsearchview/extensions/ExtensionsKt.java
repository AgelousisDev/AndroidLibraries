package com.agelousis.materialsearchview.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007\u001a\u001a\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007\u001a\u001f\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u00a2\u0006\u0002\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0007\u00a2\u0006\u0002\u0010\u0010\u001a:\u0010\u0013\u001a\u00020\u000f*\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0016\u001a\u0012\u0010\u0018\u001a\u00020\u0005*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000f\u001a\u0012\u0010\u001b\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e\u001a\u0012\u0010\u001f\u001a\u00020\u0001*\u00020 2\u0006\u0010!\u001a\u00020\"\u001a\u0019\u0010#\u001a\u00020\u0001*\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006$"}, d2 = {"setImageFromBitmap", "", "appCompatImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "bitmap", "Landroid/graphics/Bitmap;", "setImageFromByteArray", "byteArray", "", "", "setImageFromFile", "file", "Ljava/io/File;", "setImageFromResourceId", "resourceId", "", "(Landroidx/appcompat/widget/AppCompatImageView;Ljava/lang/Integer;)V", "setImageFromVectorResourceId", "vectorResourceId", "calculateInSampleSize", "", "resource", "Lkotlin/Pair;", "Landroid/content/res/Resources;", "fromVector", "Landroid/graphics/drawable/Drawable;", "padding", "infiniteAlphaAnimation", "Landroid/view/View;", "state", "", "initializeField", "Landroid/content/Context;", "appCompatEditText", "Landroidx/appcompat/widget/AppCompatEditText;", "setAnimatedImageResourceId", "MaterialSearchView_debug"})
public final class ExtensionsKt {
    
    public static final void setAnimatedImageResourceId(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView $this$setAnimatedImageResourceId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer resourceId) {
    }
    
    public static final void infiniteAlphaAnimation(@org.jetbrains.annotations.NotNull()
    android.view.View $this$infiniteAlphaAnimation, boolean state) {
    }
    
    public static final void initializeField(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$initializeField, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatEditText appCompatEditText) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap fromVector(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable $this$fromVector, int padding) {
        return null;
    }
    
    public static final int calculateInSampleSize(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView $this$calculateInSampleSize, @org.jetbrains.annotations.Nullable()
    java.io.File file, @org.jetbrains.annotations.Nullable()
    byte[] byteArray, @org.jetbrains.annotations.Nullable()
    kotlin.Pair<? extends android.content.res.Resources, java.lang.Integer> resource) {
        return 0;
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageFromResourceId"})
    public static final void setImageFromResourceId(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView appCompatImageView, @org.jetbrains.annotations.Nullable()
    java.lang.Integer resourceId) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageFromByteArray"})
    public static final void setImageFromByteArray(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView appCompatImageView, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Byte> byteArray) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageFromFile"})
    public static final void setImageFromFile(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView appCompatImageView, @org.jetbrains.annotations.Nullable()
    java.io.File file) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageFromVectorResourceId"})
    public static final void setImageFromVectorResourceId(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView appCompatImageView, @org.jetbrains.annotations.Nullable()
    java.lang.Integer vectorResourceId) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageFromBitmap"})
    public static final void setImageFromBitmap(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView appCompatImageView, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap) {
    }
}