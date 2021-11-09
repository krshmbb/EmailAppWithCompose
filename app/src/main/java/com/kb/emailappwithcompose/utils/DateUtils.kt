package com.kb.emailappwithcompose.utils

import android.content.Context
import com.kb.emailappwithcompose.R
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.math.abs

fun getDate(context: Context, date: Date) : String {
    val today = Date()
    val diffMillis = abs(today.time - date.time)
    return when (TimeUnit.DAYS.convert(diffMillis, TimeUnit.MILLISECONDS)) {
        0L -> {
            val sdf = SimpleDateFormat("HH:mm a", Locale.ENGLISH)
            sdf.format(date)
        }
        1L -> {
            context.getString(R.string.yesterday)
        }
        else -> {
            val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
            sdf.format(date)
        }
    }
}