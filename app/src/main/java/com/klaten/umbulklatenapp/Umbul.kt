package com.klaten.umbulklatenapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Umbul(
    val name: String,
    val description: String,
    val photo: Int
) : Parcelable {

}

