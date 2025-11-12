package com.beluco.betvisionultimate.ui
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.beluco.betvisionultimate.R
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val name = findViewById<EditText>(R.id.name)
        val email = findViewById<EditText>(R.id.email)
        val pass = findViewById<EditText>(R.id.password)
        val passc = findViewById<EditText>(R.id.password_confirm)
        findViewById<Button>(R.id.btn_register_submit).setOnClickListener {
            if(name.text.isEmpty() || email.text.isEmpty() || pass.text.isEmpty() || passc.text.isEmpty()) {
                Toast.makeText(this, getString(R.string.fill_all), Toast.LENGTH_SHORT).show(); return@setOnClickListener
            }
            if(pass.text.toString() != passc.text.toString()) {
                Toast.makeText(this, getString(R.string.password_mismatch), Toast.LENGTH_SHORT).show(); return@setOnClickListener
            }
            startActivity(Intent(this, com.beluco.betvisionultimate.ui.LoginActivity::class.java))
            finish()
        }
    }
}
