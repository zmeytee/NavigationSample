package com.example.feature.profile

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.core.ui.components.MyButton
import com.example.core.ui.components.MyTopAppBar

@Composable
internal fun ProfileScreen2(
    navigateToProfile3: () -> Unit,
    navigateBack: () -> Unit,
) {
    Column {
        MyTopAppBar(title = "Profile #2", onClickBack = navigateBack)

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            MyButton(
                text = "To Profile #3",
                onClick = navigateToProfile3,
            )
        }
    }
}