package com.example.lorempicsum_domain.di

import com.example.lorempicsum_domain.repository.PicSumRepository
import com.example.lorempicsum_domain.use_case.GetPicturesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object PicSumDomainModule {

    @Provides
    fun provideGetPicturesUseCase(picSumRepository: PicSumRepository): GetPicturesUseCase {
        return GetPicturesUseCase(picSumRepository)
    }
}