package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SaludoActivity : AppCompatActivity() {

    private lateinit var txtSaludo : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)

        //Se obtiene una referencia a los controles de la interfaz
        txtSaludo = findViewById(R.id.txtSaludo)

        //Se recupera la información pasada en el internet
        val saludo = intent.getStringExtra("NOMBRE")

        //Se realiza el mensaje que vamos a mostrar
        txtSaludo.text = "Hola $saludo"
    }
}