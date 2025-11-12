package com.beluco.betvision.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.beluco.betvision.R
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val nameInput = findViewById<EditText>(R.id.name)
        val emailInput = findViewById<EditText>(R.id.email)
        val passInput = findViewById<EditText>(R.id.password)
        val passConfirm = findViewById<EditText>(R.id.password_confirm)
        val registerBtn = findViewById<Button>(R.id.btn_register_submit)
        registerBtn.setOnClickListener {
            val name = nameInput.text.toString(); val email = emailInput.text.toString(); val pass = passInput.text.toString(); val passc = passConfirm.text.toString()
            if(name.isEmpty() || email.isEmpty() || pass.isEmpty() || passc.isEmpty()) { Toast.makeText(this, getString(R.string.fill_all), Toast.LENGTH_SHORT).show(); return@setOnClickListener }
            if(pass != passc) { Toast.makeText(this, getString(R.string.password_mismatch), Toast.LENGTH_SHORT).show(); return@setOnClickListener }
            Toast.makeText(this, getString(R.string.register_success), Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, LoginActivity::class.java)); finish()
        }
    }
}