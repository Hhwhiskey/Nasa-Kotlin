package com.hodges.kevin.nasa_kotlin.mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hodges.kevin.nasa_kotlin.mvvm.datasource.NasaDataSource
import javax.inject.Inject

class NasaViewModel
@Inject constructor(private val nasaDataSource: NasaDataSource
) : ViewModel() {

    var myLiveData: MutableLiveData<String> = MutableLiveData()

    fun getAPOD() {
        val data: String = nasaDataSource.getAPOD()
        myLiveData.postValue(data)
    }
}