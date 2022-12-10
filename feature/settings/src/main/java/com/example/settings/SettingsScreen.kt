package com.example.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.core.ui.MyButton
import com.example.core.ui.MyTopAppBar

@Composable
fun SettingsScreen(navController: NavController) {
    Column {
        MyTopAppBar(title = "Settings")

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(modifier = Modifier.verticalScroll(state = rememberScrollState())) {
                MyButton(
                    text = "To Settings #2",
                    onClick = {
                        navController.navigate("settings2") {
                            launchSingleTop = true
                        }
                    }
                )

                MyButton(
                    text = "To Settings #3",
                    onClick = {
                        navController.navigate("settings3") {
                            launchSingleTop = true
                        }
                    }
                )
            }
        }
    }
}