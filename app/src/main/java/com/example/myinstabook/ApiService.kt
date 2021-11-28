package com.example.myinstabook

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("search/users")
    @Headers("Authorization: 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: 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")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: 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")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: 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")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>

//    @GET("users")
//    @Headers("Authorization: token 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")
//    fun getListUser(): Call<UserResponse>
}