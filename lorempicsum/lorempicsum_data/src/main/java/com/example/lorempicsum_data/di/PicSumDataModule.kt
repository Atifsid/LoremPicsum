package com.example.lorempicsum_data.di

import com.example.lorempicsum_data.network.LoremPicSumService
import com.example.lorempicsum_data.repository.PicSumRepoImpl
import com.example.lorempicsum_domain.repository.PicSumRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@InstallIn(SingletonComponent::class)
@Module
object PicSumDataModule {

    @Provides
    fun provideLoremPicSumApiService(retrofit: Retrofit): LoremPicSumService {
        return retrofit.create(LoremPicSumService::class.java)
    }

    @Provides
    fun providePicSumRepository(picSumService: LoremPicSumService): PicSumRepository {
        return PicSumRepoImpl(picSumService)
    }
}