package com.example.myinstabook

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val login: String,
    val id: Int,
    val avatar_url: String
) : Parcelable