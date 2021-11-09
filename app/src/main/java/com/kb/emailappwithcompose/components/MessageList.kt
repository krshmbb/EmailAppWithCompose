package com.kb.emailappwithcompose.components

import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.kb.emailappwithcompose.data.models.Message
import com.kb.emailappwithcompose.testdata.testMessages

@Composable
fun MessageList(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(message)
            Divider(color = Color.LightGray)
        }
    }
}

@Preview
@Composable
fun previewMessageList() {
    MessageList(messages = testMessages)
}