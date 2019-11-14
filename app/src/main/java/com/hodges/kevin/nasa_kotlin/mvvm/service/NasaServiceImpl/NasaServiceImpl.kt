package com.hodges.kevin.nasa_kotlin.mvvm.service.NasaServiceImpl

import com.hodges.kevin.nasa_kotlin.mvvm.service.NasaService
import javax.inject.Inject

class NasaServiceImpl @Inject constructor(): NasaService{

    override fun getAPOD(): String {
        return super.getAPOD()
    }
}
