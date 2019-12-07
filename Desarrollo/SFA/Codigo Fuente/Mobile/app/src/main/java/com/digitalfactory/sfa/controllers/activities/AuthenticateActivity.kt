package com.digitalfactory.sfa.controllers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.digitalfactory.sfa.R
import android.util.Log
import kotlinx.android.synthetic.main.activity_authenticate.*
import com.digitalfactory.sfa.models.SettingsRepository
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry

import com.github.mikephil.charting.data.BarData





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

      /*  val entries =  arrayListOf<BarEntry>()
        entries.add(BarEntry(0f, 30f))
        entries.add(BarEntry(1f, 80f))
        entries.add(BarEntry(2f, 60f))
        entries.add(BarEntry(3f, 50f))
        // gap of 2f
        entries.add(BarEntry(5f, 70f))
        entries.add(BarEntry(6f, 60f))

        val set = BarDataSet(entries, "BarDataSet")

        val data = BarData(set)
        data.barWidth = 0.9f // set custom bar width

        BarChartView.setData(data)
        BarChartView.setFitBars(true) // make the x-axis fit exactly all bars
        BarChartView.invalidate() // refresh*/
    }
}
