package com.digitalfactory.sfa.controllers.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.digitalfactory.sfa.R
import com.digitalfactory.sfa.models.SettingsRepository

import com.google.android.material.bottomnavigation.BottomNavigationView

import com.digitalfactory.sfa.controllers.fragments.BillFragment
import com.digitalfactory.sfa.controllers.fragments.IntakeFragment
import com.digitalfactory.sfa.controllers.fragments.TrendFragment

import android.view.MenuItem
import androidx.fragment.app.Fragment


class MainActivity : AppCompatActivity() {

    lateinit var settings: SettingsRepository

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        navigateTo(item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
        // After creation, show home content
        navigateTo(navView.menu.findItem(R.id.navigation_intake))

        showOnBoarding()

    }

    private fun showOnBoarding() {
        settings = SettingsRepository(this)
        if (settings.shouldShowOnBoarding) {
            startActivity(Intent(this, AuthenticateActivity::class.java))
        }
    }

    private fun navigateTo(item: MenuItem): Boolean {
        item.isChecked = true
        return supportFragmentManager
            .beginTransaction()
            .replace(R.id.content, getFragmentFor(item))
            .commit() > 0
    }

    private fun getFragmentFor(item: MenuItem): Fragment {
        return when(item.itemId) {
            R.id.navigation_bill -> BillFragment()
            R.id.navigation_intake -> IntakeFragment()
            R.id.navigation_trend -> TrendFragment()

            else -> BillFragment()
        }
    }
}
