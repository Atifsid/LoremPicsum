package com.example.lorempicsuminfo_data.network

import com.example.lorempicsuminfo_data.model.PicSumInfoResponseDTO
import retrofit2.http.GET
import retrofit2.http.Path

interface LoremPicSumInfoService {

    @GET("id/{imgId}/info")
    fun getPictureInfo(@Path("imgId") imgId: Int): PicSumInfoResponseDTO
}