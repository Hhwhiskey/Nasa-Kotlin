package com.hodges.kevin.nasa_kotlin.di.appcomponent

import com.hodges.kevin.nasa_kotlin.MyApplication
import com.hodges.kevin.nasa_kotlin.di.module.*
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        // Injection modules
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class,
        // MVVM
        AppModule::class,
        ServiceModule::class,
        DataSourceModule::class,
        ViewModelModule::class,
        ActivityModule::class
    ]
)
interface AppComponent: AndroidInjector<MyApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MyApplication>()
}