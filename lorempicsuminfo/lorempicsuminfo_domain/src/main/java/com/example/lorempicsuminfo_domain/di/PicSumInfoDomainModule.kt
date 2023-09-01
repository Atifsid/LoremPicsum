package com.example.lorempicsuminfo_domain.di

import com.example.lorempicsuminfo_domain.repository.PicSumInfoRepository
import com.example.lorempicsuminfo_domain.use_case.GetPictureInfoUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object PicSumInfoDomainModule {

    @Provides
    fun provideGetPicSumInfoUseCase(picSumInfoRepository: PicSumInfoRepository): GetPictureInfoUseCase {
        return GetPictureInfoUseCase(picSumInfoRepository)
    }
}