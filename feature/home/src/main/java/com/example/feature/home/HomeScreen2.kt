package com.example.feature.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.core.ui.components.MyButton
import com.example.core.ui.components.MyTopAppBar

@Composable
internal fun HomeScreen2(
    navigateToHome3: () -> Unit,
    navigateBack: () -> Unit,
) {
    Column {
        MyTopAppBar(title = "Home #2", onClickBack = navigateBack)

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            MyButton(
                text = "To Home #3",
                onClick = navigateToHome3,
            )
        }
    }
}