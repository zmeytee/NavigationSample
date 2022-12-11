package com.example.feature.profile

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.core.ui.MyButton
import com.example.core.ui.MyTopAppBar

@Composable
fun ProfileScreen(
    navigateToProfile2: () -> Unit,
    navigateToProfile3: () -> Unit,
) {
    Column {
        MyTopAppBar(title = "Profile")

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(modifier = Modifier.verticalScroll(state = rememberScrollState())) {
                MyButton(
                    text = "To Profile #2",
                    onClick = navigateToProfile2,
                )

                MyButton(
                    text = "To Profile #3",
                    onClick = navigateToProfile3,
                )
            }
        }
    }
}