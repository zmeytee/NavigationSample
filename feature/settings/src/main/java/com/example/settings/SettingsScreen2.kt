package com.example.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.core.ui.MyButton
import com.example.core.ui.MyTopAppBar

@Composable
internal fun SettingsScreen2(
    navigateToSettings3: () -> Unit,
    navigateBack: () -> Unit,
) {
    Column {
        MyTopAppBar(title = "Settings #2", onClickBack = navigateBack)

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            MyButton(
                text = "To Settings #3",
                onClick = navigateToSettings3,
            )
        }
    }
}