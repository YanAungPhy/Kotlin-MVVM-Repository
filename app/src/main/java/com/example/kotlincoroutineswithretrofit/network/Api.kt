package com.example.kotlincoroutineswithretrofit.network

import com.example.kotlincoroutineswithretrofit.model.Post
import retrofit2.http.GET

interface Api {

    @GET("posts")
    suspend fun getPost() : List<Post>
}