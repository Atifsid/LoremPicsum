package com.example.lorempicsum_data.mapper

import com.example.lorempicsum_data.model.ImageDTO
import com.example.lorempicsum_domain.model.Image

fun ImageDTO.toDomainImage(): Image {
    return Image (
        author=this.author?:"",
        url=this.url?:"",
        id = this.id?:"",
        download_url = this.download_url?:"",
        height = this.height?:0,
        width = this.width?:0
    )
}