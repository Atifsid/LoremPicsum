package com.example.lorempicsum_domain.model

data class Image(
    val author: String,
    val download_url: String,
    val height: Int,
    val id: String,
    val url: String,
    val width: Int
)