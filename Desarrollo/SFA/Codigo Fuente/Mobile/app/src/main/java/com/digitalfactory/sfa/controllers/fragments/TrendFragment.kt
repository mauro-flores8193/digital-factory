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

       /* val pieChart =  PieChart(view.context);
        val NoOfEmp = arrayListOf()

        NoOfEmp.add(Entry(945f, 0))
        NoOfEmp.add(Entry(1040f, 1))
        NoOfEmp.add(Entry(1133f, 2))
        NoOfEmp.add(Entry(1240f, 3))
        NoOfEmp.add(Entry(1369f, 4))
        NoOfEmp.add(Entry(1487f, 5))
        NoOfEmp.add(Entry(1501f, 6))
        NoOfEmp.add(Entry(1645f, 7))
        NoOfEmp.add(Entry(1578f, 8))
        NoOfEmp.add(Entry(1695f, 9))
        val dataSet = PieDataSet(NoOfEmp, "Number Of Employees")

        val year = arrayListOf()

        year.add("2008")
        year.add("2009")
        year.add("2010")
        year.add("2011")
        year.add("2012")
        year.add("2013")
        year.add("2014")
        year.add("2015")
        year.add("2016")
        year.add("2017")
        val data = PieData(year, dataSet)
        pieChart.setData(data)
        dataSet.setColors(*ColorTemplate.COLORFUL_COLORS)
        pieChart.animateXY(5000, 5000)*/

        

       /* val lineChartView = LineChart(view.context)
        val revenueComp1 = arrayListOf(10000f, 20000f, 30000f, 40000f)
        val revenueComp2 = arrayListOf(12000f, 23000f, 35000f, 48000f)
        val point1 = Entry(0f, 50f)  // on point/index 0, the data is 50
        val point2 = Entry(1f, 100f) // on point/index 1, the data is 100
        val point3 = Entry(2f, 75f)  // on point/index 2, the data is 75

        val entries1 = revenueComp1.mapIndexed { index, arrayList ->
            return@mapIndexed Entry(index.toFloat(), arrayList[index])
        }

        val entries2 = revenueComp1.mapIndexed { index, arrayList ->
            return@mapIndexed Entry(index.toFloat(), arrayList[index])
        }

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
        lineChartView.data = data*/
    }
}
