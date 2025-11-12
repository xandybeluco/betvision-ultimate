package com.beluco.betvisionultimate.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.beluco.betvisionultimate.R
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val email = findViewById<EditText>(R.id.email)
        val pass = findViewById<EditText>(R.id.password)
        findViewById<Button>(R.id.btn_login).setOnClickListener {
            if(email.text.isEmpty() || pass.text.isEmpty()) {
                Toast.makeText(this, getString(R.string.fill_all), Toast.LENGTH_SHORT).show(); return@setOnClickListener
            }
            startActivity(Intent(this, com.beluco.betvisionultimate.ui.DashboardActivity::class.java))
            finish()
        }
        findViewById<Button>(R.id.btn_register).setOnClickListener {
            startActivity(Intent(this, com.beluco.betvisionultimate.ui.RegisterActivity::class.java))
        }
    }
}
