package com.example.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.core.ui.components.MyTopAppBar

@Composable
internal fun SettingsScreen3(
    navigateBack: () -> Unit,
) {
    Column {
        MyTopAppBar(title = "Settings #3", onClickBack = navigateBack)
    }
}