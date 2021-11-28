package com.example.myinstabook

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DetailUserResponse(
    val login: String,
    val id: Int,
    val avatar_url: String,
    val followers_url: String,
    val following_url: String,
    val name: String,
    val followers: Int,
    val following: Int
) : Parcelable