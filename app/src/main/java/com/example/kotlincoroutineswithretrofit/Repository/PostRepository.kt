package com.example.kotlincoroutineswithretrofit.Repository

import com.example.kotlincoroutineswithretrofit.network.RetrofitBuilder

class PostRepository {

    suspend fun getPost() = RetrofitBuilder.api.getPost()
}