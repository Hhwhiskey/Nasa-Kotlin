package com.hodges.kevin.nasa_kotlin.di.module

import android.app.Application
import android.content.Context
import com.hodges.kevin.nasa_kotlin.MyApplication
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class AppModule {

//   @Binds
//   @Singleton
//   abstract fun provideContext(myApplication: MyApplication): MyApplication
}