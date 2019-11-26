package com.socha.fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel: ViewModel(){
    private val mName = MutableLiveData<String>()
    private val mKampus = MutableLiveData<String>()
    val name: LiveData<String> get() = mName
    val kampus: LiveData<String> get() = mKampus
    fun setName(name: String) { mName.value = name }
    fun setKampus(kampus: String) { mKampus.value = kampus }
}