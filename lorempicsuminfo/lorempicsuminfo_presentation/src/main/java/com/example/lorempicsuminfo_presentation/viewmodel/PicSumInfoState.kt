package com.example.lorempicsuminfo_presentation.viewmodel

import com.example.lorempicsuminfo_domain.model.ImageInfo

data class PicSumInfoState(
    val isLoading:Boolean=false,
    val error:String="",
    val data:ImageInfo?=null
)