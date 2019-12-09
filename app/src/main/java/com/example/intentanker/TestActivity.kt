package com.example.intentanker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        var value = intent.getStringExtra("color")
        when(value){
            "amarillo" -> {
                colorTextView.setBackgroundResource(R.color.colorTextView1)
                colorTextView.setText(value)}
            "rojo" -> { colorTextView2.setBackgroundResource(R.color.colorTextView2)
                colorTextView2.setText(value)

            }

        }

    }
}
