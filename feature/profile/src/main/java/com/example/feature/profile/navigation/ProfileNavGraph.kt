package com.example.feature.profile.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.feature.profile.ProfileScreen
import com.example.feature.profile.ProfileScreen2
import com.example.feature.profile.ProfileScreen3

private fun NavController.navigateToProfile2() {
    navigate("profile2") {
        launchSingleTop = true
    }
}

private fun NavController.navigateToProfile3() {
    navigate("profile3") {
        launchSingleTop = true
    }
}

fun NavGraphBuilder.profileNavGraph(navController: NavController) {
    navigation(startDestination = "profile", route = "profile_graph") {
        composable("profile") {
            ProfileScreen(
                navigateToProfile2 = {
                    navController.navigateToProfile2()
                },
                navigateToProfile3 = {
                    navController.navigateToProfile3()
                },
            )
        }
        composable("profile2") {
            ProfileScreen2(
                navigateToProfile3 = {
                    navController.navigateToProfile3()
                },
                navigateBack = {
                    navController.popBackStack()
                },
            )
        }
        composable("profile3") {
            ProfileScreen3(
                navigateBack = {
                    navController.popBackStack()
                },
            )
        }
    }
}