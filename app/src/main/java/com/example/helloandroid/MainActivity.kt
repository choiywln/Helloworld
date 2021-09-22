package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.widget.ImageView
import android.widget.Toast
import com.example.helloandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //private lateinit var imageView: ImageView
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: android.view.View) {
        binding.imageView.setImageResource(R.drawable.drawing)

        Toast.makeText( this, "이미지를 보여줍니다.", Toast.LENGTH_LONG).show()
    }
}