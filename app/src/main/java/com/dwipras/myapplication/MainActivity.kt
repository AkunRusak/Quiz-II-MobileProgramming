package com.dwipras.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val usernameInput = findViewById<EditText>(R.id.inputUsername)
        val passwordInput = findViewById<EditText>(R.id.inputPassword)
        val loginButton = findViewById<Button>(R.id.btnLogin)

        // Login Button
        loginButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            // Validation
            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Isi Username dan Password", Toast.LENGTH_SHORT).show()
            } else {
                if (username == "dwipras" && password == "dwipras") {
                    Toast.makeText(this, "Login berhasil!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Kesalahan pada Username atau Password", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
