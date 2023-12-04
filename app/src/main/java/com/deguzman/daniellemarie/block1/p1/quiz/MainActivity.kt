package com.deguzman.daniellemarie.block1.p1.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var firstName: EditText
    private lateinit var middleName : EditText
    private lateinit var lastName : EditText
    private lateinit var btCompleteName : Button
    private lateinit var nameStringDisplay : String
    private lateinit var dcName : Names

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstName = findViewById(R.id.et_enter_first_name)
        middleName = findViewById(R.id.et_enter_middle_name)
        lastName = findViewById(R.id.et_enter_last_name)
        btCompleteName = findViewById(R.id.bt_display_complete)

        btCompleteName.setOnClickListener {
            dcName = Names(firstName.text.toString(), middleName.text.toString(), lastName.text.toString())
            nameStringDisplay = "${dcName.firstName} ${dcName.middleName} ${dcName.lastName}"
            intentFunction()
        }
    }

    private fun intentFunction() {
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("myName", nameStringDisplay)
        startActivity(intent)
    }
}