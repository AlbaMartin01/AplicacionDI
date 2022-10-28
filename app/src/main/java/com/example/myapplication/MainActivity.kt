package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var txtNombre : EditText
    private lateinit var btnAceptar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Vamos a obtener una referencia a los controles de la interfaz
        txtNombre = findViewById(R.id.txtNombre)
        btnAceptar = findViewById(R.id.btnAceptar)

        btnAceptar.setOnClickListener{

            //Se crea el Intent
            val intent = Intent(this@MainActivity, SaludoActivity::class.java)

            //Se añade al intent la información que tiene que pasar entre actividades
            intent.putExtra("NOMBRE", txtNombre.text.toString())

            //Se inicia la nueva actividad
            startActivity(intent)
        }
    }
}