package com.example.examplemvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.examplemvvm.R
import com.example.examplemvvm.ui.model.Frutas
import com.example.examplemvvm.viewmodel.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MyViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)


        val frutasObserver = Observer<List<Frutas>> {
            // Log.d("Frutas:", it[0].nombreFruta)
            txtnombre.setText(it[0].nombreFruta)
            txtcolor.setText(it[0].colorFruta)
            txtprecio.setText(it[0].precioFruta.toString())
            txtpeso.setText(it[0].pesoFruta.toString())


        }
        viewModel.getListaFrutrasLiveData().observe(this, frutasObserver)
    }
}

