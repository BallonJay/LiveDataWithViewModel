package com.example.livedatawithviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var mutableLiveData = MutableLiveData(0)
    val liveData : LiveData<Int>
        get() = mutableLiveData


    fun up()
    {
        mutableLiveData.value = mutableLiveData.value!!.plus(1)
    }

    fun down()
    {
        mutableLiveData.value = mutableLiveData.value!!.minus(1)
    }

}