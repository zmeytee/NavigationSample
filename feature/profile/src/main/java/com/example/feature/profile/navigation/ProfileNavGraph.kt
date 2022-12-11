package com.example.feature.profile.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.feature.profile.ProfileScreen
import com.example.feature.profile.ProfileScreen2
import com.example.feature.profile.ProfileScreen3

fun NavGraphBuilder.profileNavGraph(navController: NavController) {
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
}