package com.example.databindwithviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor (
private val savedStateHandle: SavedStateHandle) : ViewModel(){

    val qutoLiveData = MutableLiveData ("Live data with Hilt and ViewModel")

    fun updateQuto(){
        qutoLiveData.value = "After clicking button data in changed."
    }
}