package com.example.lorempicsum_domain.use_case

import com.example.common_utils.Resource
import com.example.lorempicsum_domain.model.Image
import com.example.lorempicsum_domain.repository.PicSumRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetPicturesUseCase(private val picSumRepository: PicSumRepository) {

    operator fun invoke(): Flow<Resource<List<Image>>> = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data = picSumRepository.getLoremPicSumImages()))
        } catch (e: Exception){
            emit(Resource.Error(message = e.message.toString()))
        }
    }
}