package com.coconut.theccoconut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        btnpengertian.setOnClickListener {
            startActivity(Intent(applicationContext, Pengertian::class.java))

        }
        btnSejarah.setOnClickListener {
            startActivity(Intent(applicationContext, Sejarah::class.java))

        }
    }
}
