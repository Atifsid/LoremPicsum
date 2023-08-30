package com.example.lorempicsum_data.repository

import com.example.lorempicsum_data.mapper.toDomainImage
import com.example.lorempicsum_data.network.LoremPicSumService
import com.example.lorempicsum_domain.model.Image
import com.example.lorempicsum_domain.repository.PicSumRepository

class PicSumRepoImpl (private val loremPicSumService: LoremPicSumService): PicSumRepository {

    override suspend fun getLoremPicSumImages(): List<Image> {
        return loremPicSumService.getImages().map {
            it.toDomainImage()
        }
    }
}