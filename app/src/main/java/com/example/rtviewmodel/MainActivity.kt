package com.example.rtviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders


class MainActivity : AppCompatActivity() {

    val viewModel by lazy  {
        ViewModelProviders.of(this).get(ChronometerViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createViewModel() {
        Log.d("1","fdjfjdfjfj")
    }
}
