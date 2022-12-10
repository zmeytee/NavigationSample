package com.example.feature.home

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
fun HomeScreen2(navController: NavController) {
    Column {
        MyTopAppBar(title = "Home #2", onNavigateBack = { navController.popBackStack() })

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            MyButton(
                text = "To Home #3",
                onClick = {
                    navController.navigate("home3") {
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}