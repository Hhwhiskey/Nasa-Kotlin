package com.hodges.kevin.nasa_kotlin.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hodges.kevin.nasa_kotlin.mvvm.viewmodel.NasaViewModel
import com.hodges.kevin.nasa_kotlin.mvvm.viewmodel.ViewModelFactory
import com.hodges.kevin.nasa_kotlin.mvvm.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(NasaViewModel::class)
    abstract fun provideNasaViewModel(nasaViewModel: NasaViewModel): ViewModel
}