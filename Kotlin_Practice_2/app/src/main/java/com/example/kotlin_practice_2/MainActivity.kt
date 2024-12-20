package com.example.kotlin_practice_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {//MainActivity -> AppCompatActivity -> Activity -> Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //버튼 누르면 SubActivity로 이동
    fun settingButton(){
        val button = findViewById<Button>(R.id.button);
        button.setOnClickListener{
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }
    }
}
