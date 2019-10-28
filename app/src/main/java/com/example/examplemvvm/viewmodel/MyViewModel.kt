package com.example.examplemvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.examplemvvm.ui.model.Frutas

class MyViewModel :ViewModel() {

    private val listData = MutableLiveData<List<Frutas>>()

    fun setListData(listaFrutas:List<Frutas>){
        listData.value = listaFrutas
    }

    fun getListaFrutras(){

    }
}