package com.example.databindwithviewmodel

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.databindwithviewmodel.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity: AppCompatActivity() {

    private val viewModel: MyViewModel by viewModels()
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)
        //assigning MyViewModel object value to viewModel.
        binding.viewModel = viewModel

        binding.lifecycleOwner = this
    }
}