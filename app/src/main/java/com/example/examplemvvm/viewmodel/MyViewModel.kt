package com.example.examplemvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.examplemvvm.domain.FrutasUseCase
import com.example.examplemvvm.ui.model.Frutas

class MyViewModel :ViewModel() {

    val frutasUseCase= FrutasUseCase()
    private val listData = MutableLiveData<List<Frutas>>()

    fun setListData(listaFrutas:List<Frutas>){
        listData.value = listaFrutas
    }

    fun getListaFrutras(){
        setListData(frutasUseCase.obtenerListaDeFrutas())
    }

    fun getListaFrutrasLiveData():LiveData<List<Frutas>>{
        return listData
    }
}