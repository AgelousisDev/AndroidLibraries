package com.agelousis.materialsearchview.models

import android.graphics.Bitmap
import java.io.File

data class MaterialSearchViewDataModel(var hint: String? = null,
                                       var iconFromFile: File? = null,
                                       var iconFromBitmap: Bitmap? = null,
                                       var iconFromByteArray: List<Byte>? = null,
                                       var iconFromResourceId: Int? = null,
                                       var iconFromVectorResourceId: Int? = null
)