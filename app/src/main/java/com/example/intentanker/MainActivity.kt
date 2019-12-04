package com.example.intentanker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor
import android.content.Intent
import org.jetbrains.anko.browse

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       btnRojo.setOnClickListener {
           startActivity(intentFor<TestActivity>("color" to "rojo"))
       }
        btnAmarillo.setOnClickListener {
            startActivity(intentFor<TestActivity>("color" to "amarillo"))
        }

        btnBrowser.setOnClickListener {
            browse("https://www.farodevigo.es/")
        }

        btnCamera.setOnClickListener {

            val REQUEST_IMAGE_CAPTURE = 1

            private fun dispatchTakePictureIntent() {
                Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
                    takePictureIntent.resolveActivity(packageManager)?.also {
                        startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
                    }
        }


    }


}
