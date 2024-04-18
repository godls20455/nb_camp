package com.example.applemarket.data

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.android.parcel.Parcelize

@Suppress("DEPRECATED_ANNOTATION")
@Parcelize
data class Goods(
    val name: String,
    val description: String,
    val seller: String,
    val price: Int,
    val address: String,
    val like: Int,
    val chat: Int,
    @DrawableRes
    val image: Int
) : Parcelable
