package com.example.lorempicsuminfo_data.repository

import com.example.lorempicsuminfo_data.mapper.toDomainImageInfo
import com.example.lorempicsuminfo_data.network.LoremPicSumInfoService
import com.example.lorempicsuminfo_domain.model.ImageInfo
import com.example.lorempicsuminfo_domain.repository.PicSumInfoRepository

class PicSumInfoRepoImpl(private val picSumInfoService: LoremPicSumInfoService) : PicSumInfoRepository {

    override suspend fun getLoremPicSumImageInfo(imgId: String): ImageInfo {
        return picSumInfoService.getPictureInfo(imgId).toDomainImageInfo()
    }
}