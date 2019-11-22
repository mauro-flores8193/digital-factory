package com.digitalfactory.sfa.controllers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.digitalfactory.sfa.R
import android.util.Log
import kotlinx.android.synthetic.main.activity_authenticate.*
import com.digitalfactory.sfa.models.SettingsRepository

class AuthenticateActivity : AppCompatActivity() {
    lateinit var settings: SettingsRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authenticate)

        settings = SettingsRepository(this)
        startButton.setOnClickListener {
            settings.didShowOnBoarding = true
            Log.d("CatchUp", "didShowOnBoarding: ${settings.didShowOnBoarding}")
            Log.d("CatchUp", "shouldShowOnBoarding: ${settings.shouldShowOnBoarding}")
            finish()
        }
    }
}
