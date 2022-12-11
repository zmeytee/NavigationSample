package com.example.feature.profile.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.core.ui.utils.navigateSingleTop
import com.example.feature.profile.ProfileScreen
import com.example.feature.profile.ProfileScreen2
import com.example.feature.profile.ProfileScreen3

const val profileNavGraphRoute = "profile_nav_graph"

private const val profileRoute = "profile"
private const val profile2Route = "profile2"
private const val profile3Route = "profile3"

private fun NavController.navigateToProfile2() {
    navigateSingleTop(profile2Route)
}

private fun NavController.navigateToProfile3() {
    navigateSingleTop(profile3Route)
}

fun NavGraphBuilder.profileNavGraph(navController: NavController) {
    navigation(startDestination = profileRoute, route = profileNavGraphRoute) {
        composable(profileRoute) {
            ProfileScreen(
                navigateToProfile2 = {
                    navController.navigateToProfile2()
                },
                navigateToProfile3 = {
                    navController.navigateToProfile3()
                },
            )
        }
        composable(profile2Route) {
            ProfileScreen2(
                navigateToProfile3 = {
                    navController.navigateToProfile3()
                },
                navigateBack = {
                    navController.popBackStack()
                },
            )
        }
        composable(profile3Route) {
            ProfileScreen3(
                navigateBack = {
                    navController.popBackStack()
                },
            )
        }
    }
}