package com.hodges.kevin.nasa_kotlin.di.module

import com.hodges.kevin.nasa_kotlin.mvvm.datasource.NasaDataSource
import com.hodges.kevin.nasa_kotlin.mvvm.datasource.impl.NasaDataSourceImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class DataSourceModule {

    @Binds
    @Singleton
    abstract fun providesNasaDataSource(nasaDataSourceImpl: NasaDataSourceImpl): NasaDataSource
}