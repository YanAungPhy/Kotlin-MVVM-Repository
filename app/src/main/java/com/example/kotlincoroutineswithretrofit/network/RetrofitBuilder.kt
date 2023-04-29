package com.example.kotlincoroutineswithretrofit.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

        private val retrofit by lazy {
            Retrofit.Builder()
                .baseUrl(Url.url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        val api: Api by lazy {
            retrofit.create(Api::class.java)
        }
}