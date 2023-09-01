package com.example.lorempicsuminfo_presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.common_utils.Resource
import com.example.lorempicsuminfo_domain.use_case.GetPictureInfoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class PicSumInfoViewModel @Inject constructor(private val getPictureInfoUseCase: GetPictureInfoUseCase) : ViewModel() {

    private val _picSumImageInfo = MutableStateFlow(PicSumInfoState())
    val picSumImageInfo: StateFlow<PicSumInfoState> = _picSumImageInfo

    fun getImageInfo(imgId: String){
        getPictureInfoUseCase(imgId).onEach {
            when(it){
                is Resource.Loading -> {
                    _picSumImageInfo.value = PicSumInfoState(isLoading = true)
                }
                is Resource.Error -> {
                    _picSumImageInfo.value = PicSumInfoState(error = it.message)
                    Log.d("TAG", "getImageInfo: ${ it.message }")
                }
                is Resource.Success -> {
                    _picSumImageInfo.value = PicSumInfoState(data = it.data)
                    Log.d("TAG", "getImageInfo: ${ it.data }")
                }
            }
        }.launchIn(viewModelScope)
    }
}