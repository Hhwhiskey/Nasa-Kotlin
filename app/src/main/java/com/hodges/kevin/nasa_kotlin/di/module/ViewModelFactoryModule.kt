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
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(NasaViewModel::class)
    abstract fun bindNasaViewModel(nasaViewModel: NasaViewModel): ViewModel
}