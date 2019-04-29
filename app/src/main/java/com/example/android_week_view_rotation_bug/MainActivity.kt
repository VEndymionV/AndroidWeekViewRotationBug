package com.example.android_week_view_rotation_bug

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.alamkanak.weekview.MonthChangeListener
import com.alamkanak.weekview.WeekView
import com.alamkanak.weekview.WeekViewDisplayable
import java.util.*

class MainActivity : AppCompatActivity(), MonthChangeListener<ExampleData> {

    private lateinit var myWeekView: WeekView<ExampleData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myWeekView = findViewById(R.id.weekView)
        myWeekView.setMonthChangeListener(this)
    }

    override fun onMonthChange(startDate: Calendar, endDate: Calendar): List<WeekViewDisplayable<ExampleData>> {
        return listOf()
    }
}
