package com.example.android_week_view_rotation_bug

import com.alamkanak.weekview.WeekViewDisplayable
import com.alamkanak.weekview.WeekViewEvent
import java.util.*

data class ExampleData(
    val id: Long,
    val title: String,
    val startTime: Calendar,
    val endTime: Calendar,
    val location: String,
    val color: Int
) : WeekViewDisplayable<ExampleData> {

    override fun toWeekViewEvent(): WeekViewEvent<ExampleData> {
        return WeekViewEvent(id, title, startTime, endTime, location, color, false, this)
    }
}