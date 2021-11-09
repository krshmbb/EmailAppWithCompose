package com.kb.emailappwithcompose

import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.kb.emailappwithcompose.components.EmailAppBar
import com.kb.emailappwithcompose.components.MessageList
import com.kb.emailappwithcompose.data.models.Message
import com.kb.emailappwithcompose.testdata.testMessages

class EmailListViewActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface {
                AppScaffold(testMessages)
            }
        }
    }

    @Composable
    private fun AppScaffold(messages: List<Message>) {
        Scaffold(
            topBar = { EmailAppBar() },
            content = { MessageList(messages = messages)},
            floatingActionButton = {
                FloatingActionButton(
                    onClick = { /*TODO*/ },
                    backgroundColor = MaterialTheme.colors.primary) {
                    Icon(Icons.Filled.Create,
                        contentDescription = stringResource(id = R.string.compose))
                }
            }
        )
    }

    @Preview
    @Composable
    private fun previewListViewContent() {
        AppScaffold(testMessages)
    }

    @Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
    @Composable
    private fun previewListViewContentDark() {
        AppScaffold(testMessages)
    }
}