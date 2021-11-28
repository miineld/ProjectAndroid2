package com.example.myinstabook

import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("users")
    @Headers("Authorization: token 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")
    fun getListUser(): Call<UserResponse>
}