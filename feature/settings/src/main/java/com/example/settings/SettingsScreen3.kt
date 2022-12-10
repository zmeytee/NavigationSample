package com.example.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.core.ui.MyTopAppBar

@Composable
fun SettingsScreen3(navController: NavController) {
    Column {
        MyTopAppBar(title = "Settings #3", onNavigateBack = { navController.popBackStack() })
    }
}