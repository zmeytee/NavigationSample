package com.example.settings

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation

private fun NavController.navigateToSettings2() {
    navigate("settings2") {
        launchSingleTop = true
    }
}

private fun NavController.navigateToSettings3() {
    navigate("settings3") {
        launchSingleTop = true
    }
}

fun NavGraphBuilder.settingsNavGraph(navController: NavController) {
    navigation(startDestination = "settings", route = "settings_graph") {
        composable("settings") {
            SettingsScreen(
                navigateToSettings2 = {
                    navController.navigateToSettings2()
                },
                navigateToSettings3 = {
                    navController.navigateToSettings3()
                },
            )
        }
        composable("settings2") {
            SettingsScreen2(
                navigateToSettings3 = {
                    navController.navigateToSettings3()
                },
                navigateBack = {
                    navController.popBackStack()
                },
            )
        }
        composable("settings3") {
            SettingsScreen3(
                navigateBack = {
                    navController.popBackStack()
                },
            )
        }
    }
}