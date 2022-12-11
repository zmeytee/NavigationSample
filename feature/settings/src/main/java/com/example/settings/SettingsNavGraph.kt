package com.example.settings

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation

fun NavGraphBuilder.settingsNavGraph(navController: NavController) {
    navigation(startDestination = "settings", route = "settings_graph") {
        composable("settings") {
            SettingsScreen(navController)
        }
        composable("settings2") {
            SettingsScreen2(navController)
        }
        composable("settings3") {
            SettingsScreen3(navController)

        }
    }
}