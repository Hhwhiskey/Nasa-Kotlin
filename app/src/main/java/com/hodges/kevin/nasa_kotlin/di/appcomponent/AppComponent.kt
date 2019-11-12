package com.hodges.kevin.nasa_kotlin.di.appcomponent

import android.app.Application
import com.hodges.kevin.nasa_kotlin.MyApplication
import com.hodges.kevin.nasa_kotlin.di.module.ActivityModule
import com.hodges.kevin.nasa_kotlin.di.module.AppModule
import com.hodges.kevin.nasa_kotlin.di.module.ViewModelFactoryModule
import com.hodges.kevin.nasa_kotlin.di.module.ViewModelModule
import com.hodges.kevin.nasa_kotlin.view.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class,
        ViewModelModule::class,
        ActivityModule::class
    ]
)
internal interface AppComponent: AndroidInjector<MyApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MyApplication>()
}