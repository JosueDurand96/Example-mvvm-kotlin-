package com.example.examplemvvm.domain

import com.example.examplemvvm.data.FrutasDataSet
import com.example.examplemvvm.ui.model.Frutas

class FrutasUseCase {

    val frutasDataSet = FrutasDataSet()
    fun obtenerListaDeFrutas(): List<Frutas> {
        return frutasDataSet.crearListaDeFrutas()
    }
}