package com.deguzman.daniellemarie.block1.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private lateinit var tvName : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tvName = findViewById(R.id.tv_name)

        val getIntent = intent.getStringExtra("myName")

        tvName.text = "$getIntent"

    }
}
