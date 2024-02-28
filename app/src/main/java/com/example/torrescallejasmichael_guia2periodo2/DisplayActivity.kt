package com.example.torrescallejasmichael_guia2periodo2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val nombres = intent.getStringExtra("NOMBRES")
        val apellidos = intent.getStringExtra("APELLIDOS")
        val email = intent.getStringExtra("EMAIL")

        val textViewNombreDisplay: TextView = findViewById(R.id.textViewNombreDisplay)
        val textViewApellidoDisplay: TextView = findViewById(R.id.textViewApellidoDisplay)
        val textViewEmailDisplay: TextView = findViewById(R.id.textViewEmailDisplay)
        val buttonExit: Button = findViewById(R.id.buttonExit)

        textViewNombreDisplay.text = nombres
        textViewApellidoDisplay.text = apellidos
        textViewEmailDisplay.text = email

        buttonExit.setOnClickListener {
            finish() // Cierro la actividad actual y vuelvo a la anterior
        }
    }
}
