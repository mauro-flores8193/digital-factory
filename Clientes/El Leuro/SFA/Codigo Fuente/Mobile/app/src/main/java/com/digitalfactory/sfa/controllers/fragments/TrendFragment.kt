package com.digitalfactory.sfa.controllers.fragments

import com.digitalfactory.sfa.R
import android.content.Context
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.digitalfactory.sfa.models.SettingsRepository
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import com.github.mikephil.charting.model.GradientColor
import kotlinx.android.synthetic.main.fragment_trend.*
import com.github.mikephil.charting.utils.ColorTemplate
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet

import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.LineData
import android.graphics.Typeface
import com.github.mikephil.charting.charts.HorizontalBarChart
import kotlinx.android.synthetic.main.activity_authenticate.*


class TrendFragment : Fragment() {

    lateinit var settings: SettingsRepository

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trend, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        settings = SettingsRepository(view.context)

        val entries =  arrayListOf<BarEntry>()
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

        BarChartView2.setData(data)
        BarChartView2.setFitBars(true) // make the x-axis fit exactly all bars
        BarChartView2.invalidate() // refresh
/*
        val lineChartView = LineChart(view.context)

        val revenueComp1 = arrayListOf(10000f, 20000f, 30000f, 40000f)
        val revenueComp2 = arrayListOf(12000f, 23000f, 35000f, 48000f)

        val point1 = Entry(0f, 50f)  // on point/index 0, the data is 50
        val point2 = Entry(1f, 100f) // on point/index 1, the data is 100
        val point3 = Entry(2f, 75f)  // on point/index 2, the data is 75

        val entries1 = revenueComp1.mapIndexed { index, arrayList -> Entry(index.toFloat(), arrayList[index]) }

        val entries2 = revenueComp1.mapIndexed { index, arrayList -> Entry(index.toFloat(), arrayList[index]) }

        val lineDataSet1 = LineDataSet(entries1, "Company 1")
        lineDataSet1.color = Color.RED
        lineDataSet1.setDrawValues(false)
        lineDataSet1.setAxisDependency(YAxis.AxisDependency.LEFT)

        val lineDataSet2 = LineDataSet(entries2, "Company 2")
        lineDataSet2.color = Color.BLUE
        lineDataSet1.setDrawValues(false)
        lineDataSet2.setAxisDependency(YAxis.AxisDependency.LEFT)

        val lineDataSets = arrayListOf(lineDataSet1, lineDataSet2)
        val data = LineData(lineDataSets as List<ILineDataSet>?)

        println( "HOLA MUNDO")
        println( data)
        println( lineDataSets)
        println( lineDataSet1)

        lineChartView.data = data

        lineChartView.axisLeft.mAxisMaximum = 1f
        lineChartView.axisLeft.mAxisMinimum = -1f
        lineChartView.axisLeft.mAxisRange = 2f

        lineChartView.invalidate()*/






    }


}

private operator fun Float.get(index: Int): Float {
        return index.toFloat()
}
