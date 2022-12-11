package com.example.feature.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.core.ui.MyTopAppBar

@Composable
internal fun ProfileScreen3(
    navigateBack: () -> Unit,
) {
    Column {
        MyTopAppBar(title = "Profile #3", onClickBack = navigateBack)
    }
}