package com.hodges.kevin.nasa_kotlin.di.module

import com.hodges.kevin.nasa_kotlin.mvvm.service.NasaService
import com.hodges.kevin.nasa_kotlin.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.Reusable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

@Module
object ServiceModule {

    @Provides
    @Reusable
    @JvmStatic
    internal fun provideNasaService(retrofit: Retrofit): NasaService {
        return retrofit.create(NasaService::class.java)
    }

    @Provides
    @Reusable
    @JvmStatic
    internal fun provideRetrofitInterface(): Retrofit {
        return Retrofit.Builder()
                 .baseUrl(Constants.Constants.BASE_URL)
                 .addConverterFactory(GsonConverterFactory.create())
                 .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                 .build()
    }
}