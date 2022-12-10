package com.example.feature.profile

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
fun ProfileScreen2(navController: NavController) {
    Column {
        MyTopAppBar(title = "Profile #2", onNavigateBack = { navController.popBackStack() })

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            MyButton(
                text = "To Profile #3",
                onClick = {
                    navController.navigate("profile3") {
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}