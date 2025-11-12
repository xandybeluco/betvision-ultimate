package com.beluco.betvisionultimate.ui
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.beluco.betvisionultimate.R
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val nav = findViewById<BottomNavigationView>(R.id.bottom_nav)
        nav.setOnItemSelectedListener { item ->
            val frag: Fragment = when(item.itemId) {
                R.id.nav_analytics -> AnalyticsFragment()
                R.id.nav_odds -> AnalyticsFragment()
                R.id.nav_history -> AnalyticsFragment()
                R.id.nav_profile -> AnalyticsFragment()
                else -> AnalyticsFragment()
            }
            supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
            true
        }
    }
}
