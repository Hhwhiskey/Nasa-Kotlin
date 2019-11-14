package com.hodges.kevin.nasa_kotlin.di.module

import com.hodges.kevin.nasa_kotlin.mvvm.service.NasaService
import com.hodges.kevin.nasa_kotlin.mvvm.service.NasaServiceImpl.NasaServiceImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class ServiceModule {

//    @Provides
//    @Reusable
//    @JvmStatic
//    internal fun provideNasaService(retrofit: Retrofit): NasaService {
//        return retrofit.create(NasaService::class.java)
//    }
//
//    @Provides
//    @Reusable
//    @JvmStatic
//    internal fun provideRetrofitInterface(): Retrofit {
//        return Retrofit.Builder()
//                 .baseUrl(Constants.BASE_URL)
//                 .addConverterFactory(GsonConverterFactory.create())
//                 .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                 .build()
//    }

    @Binds
    @Singleton
    abstract fun provideNasaService(nasaServiceImpl: NasaServiceImpl): NasaService
}