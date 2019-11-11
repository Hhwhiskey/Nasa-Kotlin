package com.hodges.kevin.nasa_kotlin.di.appcomponent

import android.app.Application
import com.hodges.kevin.nasa_kotlin.MyApplication
import com.hodges.kevin.nasa_kotlin.di.module.ViewModelFactoryModule
import com.hodges.kevin.nasa_kotlin.di.module.ViewModelModule
import com.hodges.kevin.nasa_kotlin.view.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ViewModelModule::class,
    AndroidSupportInjectionModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(myApplication: MyApplication)
}