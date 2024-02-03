package com.example.livedatawithviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        val upBtn = findViewById<Button>(R.id.upBtn)
        val downBtn = findViewById<Button>(R.id.downBtn)
        val numText = findViewById<TextView>(R.id.numText)

        upBtn.setOnClickListener {
            viewModel.up()
        }

        downBtn.setOnClickListener {
            viewModel.down()
        }

        viewModel.liveData.observe(this) {
            numText.text = it.toString()
        }
    }
}