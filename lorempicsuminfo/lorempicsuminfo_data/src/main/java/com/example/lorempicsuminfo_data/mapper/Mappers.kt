package com.example.lorempicsuminfo_data.mapper

import com.example.lorempicsuminfo_data.model.PicSumInfoResponseDTO
import com.example.lorempicsuminfo_domain.model.ImageInfo

fun PicSumInfoResponseDTO.toDomainImageInfo(): ImageInfo {
    return ImageInfo(
        author = this.author,
        url = this.url,
        width = this.width,
        download_url = this.download_url,
        height = this.height,
        id = this.id
    )
}