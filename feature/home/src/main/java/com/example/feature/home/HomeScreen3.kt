package com.example.feature.home

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.core.ui.components.MyTopAppBar

@Composable
internal fun HomeScreen3(
    navigateBack: () -> Unit,
) {
    Column {
        MyTopAppBar(title = "Home #3", onClickBack = navigateBack)
    }
}