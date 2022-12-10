package com.example.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.core.ui.MyButton
import com.example.core.ui.MyTopAppBar

@Composable
fun SettingsScreen2(navController: NavController) {
    Column {
        MyTopAppBar(title = "Settings #2", onNavigateBack = { navController.popBackStack() })

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
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