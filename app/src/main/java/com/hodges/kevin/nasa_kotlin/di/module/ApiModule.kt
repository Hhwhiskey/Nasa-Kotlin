package com.hodges.kevin.nasa_kotlin.di.module

import com.hodges.kevin.nasa_kotlin.mvvm.api.impl.NasaApiImpl
import com.hodges.kevin.nasa_kotlin.mvvm.service.NasaService
import dagger.Module
import dagger.Provides

@Module
object ApiModule {

    @Provides
    fun providesNasaAPI(nasaService: NasaService): NasaApiImpl {
        return NasaApiImpl(nasaService)
    }
}