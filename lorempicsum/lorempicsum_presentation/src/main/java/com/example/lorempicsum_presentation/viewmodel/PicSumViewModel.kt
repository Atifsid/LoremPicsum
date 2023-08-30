package com.example.lorempicsum_presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.common_utils.Resource
import com.example.lorempicsum_domain.use_case.GetPicturesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class PicSumViewModel @Inject constructor(private val getPicturesUseCase: GetPicturesUseCase): ViewModel() {

    private val _picSumImage = MutableStateFlow(PicSumState())
    val picSumImage : StateFlow<PicSumState> = _picSumImage

    init {
        getImages()
    }

    private fun getImages(){
        getPicturesUseCase().onEach {
            when(it){
                is Resource.Loading -> {
                    _picSumImage.value = PicSumState(isLoading = true)
                }
                is Resource.Error -> {
                    _picSumImage.value = PicSumState(error = it.message)
                }
                is Resource.Success -> {
                    _picSumImage.value = PicSumState(data = it.data)
                }
            }
        }.launchIn(viewModelScope)
    }
}