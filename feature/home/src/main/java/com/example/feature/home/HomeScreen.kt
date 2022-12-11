package com.example.feature.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.core.ui.components.MyButton
import com.example.core.ui.components.MyTopAppBar

@Composable
internal fun HomeScreen(
    navigateToHome2: () -> Unit,
    navigateToHome3: () -> Unit,
) {
    Column {
        MyTopAppBar(title = "Home")

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(modifier = Modifier.verticalScroll(state = rememberScrollState())) {
                MyButton(
                    text = "To Home #2",
                    onClick = navigateToHome2,
                )

                MyButton(
                    text = "To Home #3",
                    onClick = navigateToHome3,
                )
            }
        }
    }
}