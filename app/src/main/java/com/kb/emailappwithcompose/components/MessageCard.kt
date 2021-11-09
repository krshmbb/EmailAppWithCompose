package com.kb.emailappwithcompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconToggleButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kb.emailappwithcompose.R
import com.kb.emailappwithcompose.data.models.Message
import com.kb.emailappwithcompose.utils.getDate
import java.util.*

@Composable
fun MessageCard(message: Message) {
    Row(modifier = Modifier
        .background(Color.White)
        .padding(10.dp)
        .fillMaxWidth()) {
        Image(painter = painterResource(id = message.avatarId),
            contentDescription = stringResource(id = R.string.profile_pic_description),
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(modifier = Modifier.weight(4.5f)) {
            Text(text = message.sender,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp)
            Text(
                text = message.subject, fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = message.snippet,
                fontSize = 14.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
        Column(modifier = Modifier.weight(1.5f),
            horizontalAlignment = Alignment.End){
            Text(text = getDate(LocalContext.current, message.received),
                fontSize = 14.sp,
                textAlign = TextAlign.End)
            IconToggleButton(
                checked = message.favorite,
                onCheckedChange = { },
                modifier = Modifier.size(28.dp)
            ) {
                Icon(
                    imageVector = if(message.favorite) Icons.Filled.Favorite
                        else Icons.Outlined.FavoriteBorder,
                    contentDescription = stringResource(id = R.string.favorite_description)
                )
            }
        }
    }
}

@Preview
@Composable
fun previewMessageCard1_today() {
    MessageCard(
        Message("Calvin Hobbes", R.drawable.ali,
        "Test subject", "Snippet", Date(), true)
    )
}

@Preview
@Composable
fun previewMessageCard2_yesterday_longSnippet() {
    val cal = Calendar.getInstance()
    cal.add(Calendar.DATE, -1)
    val yesterday = cal.time
    MessageCard(
        Message("Calvin Hobbes", R.drawable.ali,
            "Test subject", "This is a really really really really " +
                    "really really really really really really long email", yesterday, false)
    )
}

@Preview
@Composable
fun previewMessageCard3_today() {
    MessageCard(
        Message("Calvin Hobbes", R.drawable.ali,
            "Test subject", "Snippet", Date(121, 9, 8), false)
    )
}