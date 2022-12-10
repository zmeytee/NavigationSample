package com.example.feature.home

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.core.ui.MyTopAppBar

@Composable
fun HomeScreen3(navController: NavController) {
    Column {
        MyTopAppBar(title = "Home #3", onNavigateBack = { navController.popBackStack() })
    }
}