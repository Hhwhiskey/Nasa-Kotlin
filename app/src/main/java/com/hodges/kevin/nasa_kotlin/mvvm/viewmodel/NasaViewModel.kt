package com.hodges.kevin.nasa_kotlin.mvvm.viewmodel

import android.content.Context
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.lifecycle.ViewModel
import java.time.Duration
import javax.inject.Inject

class NasaViewModel @Inject constructor(
) : ViewModel() {

    fun makeToast() {
//        Toast.makeText(context, "Some messsage", LENGTH_LONG).show()
    }
}