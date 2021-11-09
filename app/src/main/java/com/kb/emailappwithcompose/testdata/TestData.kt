package com.kb.emailappwithcompose.testdata

import com.kb.emailappwithcompose.R
import com.kb.emailappwithcompose.data.models.Message
import java.util.*

val testMessages = listOf (
    Message("Ali Conners", R.drawable.ali,
        "Important Announcement", "XYZ is now booking January jobs. " +
                "Visit our website for inspiration", today(), false),
    Message("Taylor Brooks", R.drawable.taylor,
        "Halloween in West Village, NYC", "Feast your eyes on the incredible " +
                "array of food, West Village has to offer ", today(), false),
    Message("Taylor Brooks", R.drawable.taylor,
        "Create Your Community", "Being intentional about your network at all " +
                "levels of your career is essential", today(), false),
    Message("Ali Connors", R.drawable.ali,
        "ABC has been trying to reach you", "Dear Guest, Recently we tried to reach " +
                "you to schedule your free consult.", yesterday(), true),
    Message("Ali Connors", R.drawable.ali,
        "Get 20% off your nest website subscription", "For a limited time, get " +
                "20% off your next purchase", yesterday(), false),
    Message("Taylor Brooks", R.drawable.taylor,
        "Welcome to QWERTY", "Watch your welcome video", randomDate(), false),
    Message("Ali Connors", R.drawable.ali,
        "Last Chance To Purchase Tickets", "Presale ends tonight.", randomDate(), true),
    Message("Ali Connors", R.drawable.ali,
    "Customize your virtual holiday party", "Hi there! The final countdown is on to " +
                "customize your virtual holiday event", randomDate(), false),
    Message("Ali Connors", R.drawable.ali,
        "Join the Monthly Giving Program", "Get what you want.", randomDate(), false),
    Message("Taylor Brooks", R.drawable.taylor,
        "Summer Checklist", "If you have trouble displaying this email, view " +
                "it as a web page.", randomDate(), false),
    Message("Taylor Brooks", R.drawable.taylor,
        "Here's an offer for you!", "Visit the Atlanta Magic Theatre for 50% off",
        randomDate(), false)
)

private fun today() : Date {
    return Date()
}

private fun yesterday() : Date {
    val cal = Calendar.getInstance()
    cal.add(Calendar.DATE, -1)
    return cal.time
}

private fun randomDate() : Date {
    return Date(121, 9, 8)
}