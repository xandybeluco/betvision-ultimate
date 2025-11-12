package com.beluco.betvision.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.beluco.betvision.R
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val prefs = getSharedPreferences("betvision_prefs", Context.MODE_PRIVATE)
        val emailInput = findViewById<EditText>(R.id.email)
        val passInput = findViewById<EditText>(R.id.password)
        val loginBtn = findViewById<Button>(R.id.btn_login)
        val registerBtn = findViewById<Button>(R.id.btn_register)
        loginBtn.setOnClickListener {
            val email = emailInput.text.toString()
            val pass = passInput.text.toString()
            if(email.isEmpty() || pass.isEmpty()) { Toast.makeText(this, getString(R.string.fill_all), Toast.LENGTH_SHORT).show(); return@setOnClickListener }
            prefs.edit().putString("user_email", email).putString("user_name","Usuário BetVision").apply()
            startActivity(Intent(this, DashboardActivity::class.java)); finish()
        }
        registerBtn.setOnClickListener { startActivity(Intent(this, RegisterActivity::class.java)) }
    }
}