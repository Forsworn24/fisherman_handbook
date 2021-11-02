package com.example.fishermanhandbook

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Content_Activity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_layout)
        val tvTitle1 = findViewById<TextView>(R.id.tvTitle)
        val tvContent1 = findViewById<TextView>(R.id.tvContent)
        val im1 = findViewById<ImageView>(R.id.imV2)
        tvTitle1?.text = intent.getStringExtra("title")
        tvContent1?.text = intent.getStringExtra("content")
        im1?.setImageResource(intent.getIntExtra("image", R.drawable.som))
    }
}