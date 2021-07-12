package com.chamara.kotlinpicaso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://studentmanagementcrud.000webhostapp.com/images/Capture.PNG"
        val imageView:ImageView=findViewById(R.id.imageView)
        Picasso.get().load(url).into(imageView);

    }
}