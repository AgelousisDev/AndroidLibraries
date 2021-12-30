package com.agelousis.materialsearchview.enumerations

import com.agelousis.materialsearchview.R

enum class MaterialSearchViewIconState {
    SEARCH, CLOSE;

    val icon
        get() = when(this) {
            SEARCH -> R.drawable.ic_search
            CLOSE -> R.drawable.ic_close
        }

}