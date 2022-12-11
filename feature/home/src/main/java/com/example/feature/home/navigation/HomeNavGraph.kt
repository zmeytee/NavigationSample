package com.example.feature.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.feature.home.HomeScreen
import com.example.feature.home.HomeScreen2
import com.example.feature.home.HomeScreen3

const val homeNavGraphRoute = "home_nav_graph"

private const val homeRoute = "home"
private const val home2Route = "home2"
private const val home3Route = "home3"

private fun NavController.navigateToHome2() {
    navigate(home2Route) {
        launchSingleTop = true
    }
}

private fun NavController.navigateToHome3() {
    navigate(home3Route) {
        launchSingleTop = true
    }
}

fun NavGraphBuilder.homeNavGraph(navController: NavController) {
    navigation(startDestination = homeRoute, route = homeNavGraphRoute) {
        composable(homeRoute) {
            HomeScreen(
                navigateToHome2 = {
                    navController.navigateToHome2()
                },
                navigateToHome3 = {
                    navController.navigateToHome3()
                },
            )
        }
        composable(home2Route) {
            HomeScreen2(
                navigateToHome3 = {
                    navController.navigateToHome3()
                },
                navigateBack = {
                    navController.popBackStack()
                },
            )
        }
        composable(home3Route) {
            HomeScreen3(
                navigateBack = {
                    navController.popBackStack()
                },
            )
        }
    }
}