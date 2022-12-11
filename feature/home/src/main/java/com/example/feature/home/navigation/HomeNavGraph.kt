package com.example.feature.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.feature.home.HomeScreen
import com.example.feature.home.HomeScreen2
import com.example.feature.home.HomeScreen3

private fun NavController.navigateToHome2() {
    navigate("home2") {
        launchSingleTop = true
    }
}

private fun NavController.navigateToHome3() {
    navigate("home3") {
        launchSingleTop = true
    }
}

fun NavGraphBuilder.homeNavGraph(navController: NavController) {
    navigation(startDestination = "home", route = "home_graph") {
        composable("home") {
            HomeScreen(
                navigateToHome2 = {
                    navController.navigateToHome2()
                },
                navigateToHome3 = {
                    navController.navigateToHome3()
                },
            )
        }
        composable("home2") {
            HomeScreen2(
                navigateToHome3 = {
                    navController.navigateToHome3()
                },
                navigateBack = {
                    navController.popBackStack()
                },
            )
        }
        composable("home3") {
            HomeScreen3(
                navigateBack = {
                    navController.popBackStack()
                },
            )
        }
    }
}