package com.example.torrescallejasmichael_guia2periodo2

import android.content.Intent
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSaveData = findViewById<Button>(R.id.buttonSaveData)
        buttonSaveData.setOnClickListener {
            val nombres = findViewById<EditText>(R.id.editTextNombres).text.toString().trim()
            val apellidos = findViewById<EditText>(R.id.editTextApellidos).text.toString().trim()
            val email = findViewById<EditText>(R.id.editTextEmail).text.toString().trim()

            // Verifica si alguno de los campos está vacío
            if (nombres.isEmpty() || apellidos.isEmpty() || email.isEmpty()) {
                mensaje("Campos Vacios", "Se ha detectado al menos un campo vacio.")
            } else {
                val intent = Intent(this, DisplayActivity::class.java).apply {
                    putExtra("NOMBRES", nombres)
                    putExtra("APELLIDOS", apellidos)
                    putExtra("EMAIL", email)
                }
                startActivity(intent)
            }
        }
    }

    // Función para mostrar mensajes de alerta
    private fun mensaje(titulo: String, mensaje: String) {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setMessage(mensaje)
            .setTitle(titulo)
            .setPositiveButton("Aceptar") { dialog, _ ->
                dialog.dismiss()
            }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}

