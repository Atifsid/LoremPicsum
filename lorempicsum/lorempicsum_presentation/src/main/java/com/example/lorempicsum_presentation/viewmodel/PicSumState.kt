package com.example.lorempicsum_presentation.viewmodel

import com.example.lorempicsum_domain.model.Image

data class PicSumState(
    val isLoading:Boolean=false,
    val error:String="",
    val data:List<Image>?=null
)
