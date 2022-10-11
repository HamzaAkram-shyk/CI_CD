package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // this nfkjnerfref
        val progressBar = findViewById<ProgressBar>(R.id.progress)
        progressBar.max = 10
        progressBar.secondaryProgress = 10
        findViewById<View>(R.id.fab).setOnClickListener {
            var progress = progressBar.progress
            progressBar.progress = ++progress
        }


    }
}