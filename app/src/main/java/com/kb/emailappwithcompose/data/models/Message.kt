package com.kb.emailappwithcompose.data.models

import android.graphics.drawable.Drawable
import java.util.*

/**
 * Message data class holding message data.
 */
data class Message (
    val sender: String,
    val avatarId: Int,
    val subject: String,
    val snippet: String,
    val received: Date,
    val favorite: Boolean
)