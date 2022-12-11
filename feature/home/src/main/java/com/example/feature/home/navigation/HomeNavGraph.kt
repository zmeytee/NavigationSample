package com.example.feature.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.feature.home.HomeScreen
import com.example.feature.home.HomeScreen2
import com.example.feature.home.HomeScreen3

fun NavGraphBuilder.homeNavGraph(navController: NavController) {
    navigation(startDestination = "home", route = "home_graph") {
        composable("home") {
            HomeScreen(navController)
        }
        composable("home2") {
            HomeScreen2(navController)
        }
        composable("home3") {
            HomeScreen3(navController)
        }
    }
}