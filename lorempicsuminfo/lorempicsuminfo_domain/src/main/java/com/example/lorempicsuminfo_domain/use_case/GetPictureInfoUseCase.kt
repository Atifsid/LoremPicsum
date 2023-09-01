package com.example.lorempicsuminfo_domain.use_case

import com.example.common_utils.Resource
import com.example.lorempicsuminfo_domain.model.ImageInfo
import com.example.lorempicsuminfo_domain.repository.PicSumInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetPictureInfoUseCase(private val picSumInfoRepository: PicSumInfoRepository) {
    operator fun invoke(imgId: String): Flow<Resource<ImageInfo>> = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data = picSumInfoRepository.getLoremPicSumImageInfo(imgId)))
        } catch (e: Exception){
            emit(Resource.Error(message = e.message.toString()))
        }
    }
}