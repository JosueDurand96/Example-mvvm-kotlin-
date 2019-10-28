package com.example.examplemvvm.data

import com.example.examplemvvm.ui.model.Frutas

class FrutasDataSet {
    fun crearListaDeFrutas():List<Frutas>{
        return listOf(
            Frutas("Manzana","Rojo",4.5F,200.0F ))
     
    }
}