package com.example.lorempicsuminfo_data.di

import com.example.lorempicsuminfo_data.network.LoremPicSumInfoService
import com.example.lorempicsuminfo_data.repository.PicSumInfoRepoImpl
import com.example.lorempicsuminfo_domain.repository.PicSumInfoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@InstallIn(SingletonComponent::class)
@Module
object PicSumInfoDataModule {
    @Provides
    fun provideLoremPicSumInfoApiService(retrofit: Retrofit): LoremPicSumInfoService {
        return retrofit.create(LoremPicSumInfoService::class.java)
    }

    @Provides
    fun providePicSumInfoRepository(picSumInfoService: LoremPicSumInfoService): PicSumInfoRepository {
        return PicSumInfoRepoImpl(picSumInfoService)
    }
}