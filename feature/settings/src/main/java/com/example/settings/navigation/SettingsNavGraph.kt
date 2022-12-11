package com.example.settings.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.settings.SettingsScreen
import com.example.settings.SettingsScreen2
import com.example.settings.SettingsScreen3

const val settingsNavGraphRoute = "settings_nav_graph"

private const val settingsRoute = "settings"
private const val settings2Route = "settings2"
private const val settings3Route = "settings3"

private fun NavController.navigateToSettings2() {
    navigate(settings2Route) {
        launchSingleTop = true
    }
}

private fun NavController.navigateToSettings3() {
    navigate(settings3Route) {
        launchSingleTop = true
    }
}

fun NavGraphBuilder.settingsNavGraph(navController: NavController) {
    navigation(startDestination = settingsRoute, route = settingsNavGraphRoute) {
        composable(settingsRoute) {
            SettingsScreen(
                navigateToSettings2 = {
                    navController.navigateToSettings2()
                },
                navigateToSettings3 = {
                    navController.navigateToSettings3()
                },
            )
        }
        composable(settings2Route) {
            SettingsScreen2(
                navigateToSettings3 = {
                    navController.navigateToSettings3()
                },
                navigateBack = {
                    navController.popBackStack()
                },
            )
        }
        composable(settings3Route) {
            SettingsScreen3(
                navigateBack = {
                    navController.popBackStack()
                },
            )
        }
    }
}