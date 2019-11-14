package com.hodges.kevin.nasa_kotlin.view.activity

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.hodges.kevin.nasa_kotlin.R
import com.hodges.kevin.nasa_kotlin.databinding.ActivityMainBinding
import com.hodges.kevin.nasa_kotlin.mvvm.viewmodel.NasaViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: NasaViewModel by lazy {
       ViewModelProviders.of(this, viewModelFactory)[NasaViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
    }
}
