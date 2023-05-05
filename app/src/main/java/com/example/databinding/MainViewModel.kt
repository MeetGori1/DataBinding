package com.example.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    val txtLiveData=MutableLiveData("")

    fun updateText(){
        txtLiveData.value="Yes, it's true"
    }
}