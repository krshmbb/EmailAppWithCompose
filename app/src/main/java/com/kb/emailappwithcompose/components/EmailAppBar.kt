package com.kb.emailappwithcompose.components

import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.kb.emailappwithcompose.R

@Composable
fun EmailAppBar() {
    TopAppBar(
        title = {
            Text(text = stringResource(id = R.string.inbox), color = MaterialTheme.colors.onPrimary)
        },
        navigationIcon = {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = stringResource(id = R.string.menu),
                tint = MaterialTheme.colors.onPrimary
            )
        },
        backgroundColor = MaterialTheme.colors.primary
    )
}

@Preview
@Composable
fun previewEmailAppBar() {
    EmailAppBar()
}
