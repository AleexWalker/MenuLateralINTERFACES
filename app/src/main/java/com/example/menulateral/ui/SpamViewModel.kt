package com.example.menulateral.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SpamViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Spam Fragment"
    }
    val text: LiveData<String> = _text
}