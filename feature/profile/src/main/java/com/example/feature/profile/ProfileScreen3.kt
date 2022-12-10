package com.example.feature.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.core.ui.MyTopAppBar

@Composable
fun ProfileScreen3(navController: NavController) {
    Column {
        MyTopAppBar(title = "Profile #3", onNavigateBack = { navController.popBackStack() })
    }
}