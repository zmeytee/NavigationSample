package com.example.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.core.ui.MyTopAppBar

@Composable
fun SettingsScreen3(
    navigateBack: () -> Unit,
) {
    Column {
        MyTopAppBar(title = "Settings #3", onClickBack = navigateBack)
    }
}