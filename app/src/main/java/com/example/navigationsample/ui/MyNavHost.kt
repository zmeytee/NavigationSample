package com.example.navigationsample.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.feature.home.HomeScreen
import com.example.feature.home.HomeScreen2
import com.example.feature.home.HomeScreen3
import com.example.feature.profile.ProfileScreen
import com.example.feature.profile.ProfileScreen2
import com.example.feature.profile.ProfileScreen3
import com.example.settings.SettingsScreen
import com.example.settings.SettingsScreen2
import com.example.settings.SettingsScreen3

@Composable
fun MyAppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "home_graph",
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
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

        navigation(startDestination = "profile", route = "profile_graph") {
            composable("profile") {
                ProfileScreen(navController)
            }
            composable("profile2") {
                ProfileScreen2(navController)
            }
            composable("profile3") {
                ProfileScreen3(navController)
            }
        }

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
}