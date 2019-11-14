package com.hodges.kevin.nasa_kotlin.di.module

import com.hodges.kevin.nasa_kotlin.view.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributesMainActivity(): MainActivity
}