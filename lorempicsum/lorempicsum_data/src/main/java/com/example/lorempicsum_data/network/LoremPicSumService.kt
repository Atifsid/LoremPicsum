package com.example.lorempicsum_data.network

import com.example.lorempicsum_data.model.PicSumResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface LoremPicSumService {

    @GET("v2/list")
    suspend fun getImages() : PicSumResponse

    @GET("v2/list")
    suspend fun getImages(
        @Query("page") page: Int,
        @Query("limit") limit: Int
    ): PicSumResponse
}