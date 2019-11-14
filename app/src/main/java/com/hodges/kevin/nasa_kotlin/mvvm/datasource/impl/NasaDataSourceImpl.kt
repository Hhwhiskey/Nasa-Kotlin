package com.hodges.kevin.nasa_kotlin.mvvm.datasource.impl

import com.hodges.kevin.nasa_kotlin.mvvm.datasource.NasaDataSource
import com.hodges.kevin.nasa_kotlin.mvvm.service.NasaService
import javax.inject.Inject

class NasaDataSourceImpl @Inject constructor(
    private val nasaService: NasaService
) : NasaDataSource {

    override fun getAPOD(): String {
       return nasaService.getAPOD()
    }
}