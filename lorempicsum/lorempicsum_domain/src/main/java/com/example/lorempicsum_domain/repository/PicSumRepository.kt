package com.example.lorempicsum_domain.repository

import com.example.lorempicsum_domain.model.Image

interface PicSumRepository {

    suspend fun getLoremPicSumImages() : List<Image>
}