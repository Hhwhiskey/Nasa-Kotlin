package com.hodges.kevin.nasa_kotlin.di.module

import com.hodges.kevin.nasa_kotlin.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}