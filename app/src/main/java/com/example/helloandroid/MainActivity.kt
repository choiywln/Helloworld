package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: android.view.View) {
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(R.drawable.drawing)

        Toast.makeText( this, "이미지를 보여줍니다.", Toast.LENGTH_LONG).show()
    }
}