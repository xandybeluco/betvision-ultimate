package com.beluco.betvision.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.beluco.betvision.R
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler(Looper.getMainLooper()).postDelayed({ startActivity(Intent(this, LoginActivity::class.java)); finish() }, 1200)
    }
}