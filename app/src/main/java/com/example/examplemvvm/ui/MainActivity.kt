package com.example.examplemvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.examplemvvm.R
import com.example.examplemvvm.ui.model.Frutas
import com.example.examplemvvm.viewmodel.MyViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel= ViewModelProviders.of(this).get(MyViewModel::class.java)

        val frutasObserver = Observer<List<Frutas>>{
            Log.d("Frutas:",it.toString())
        }
        viewModel.getListaFrutrasLiveData().observe(this,frutasObserver)
    }
}
