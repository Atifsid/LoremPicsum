package com.example.lorempicsuminfo_domain.repository

import com.example.lorempicsuminfo_domain.model.ImageInfo

interface PicSumInfoRepository {
    suspend fun getLoremPicSumImageInfo(imgId: String): ImageInfo
}