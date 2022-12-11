package com.example.navigationsample.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.feature.home.navigation.homeNavGraph
import com.example.feature.home.navigation.homeNavGraphRoute
import com.example.feature.profile.navigation.profileNavGraph
import com.example.settings.navigation.settingsNavGraph

@Composable
fun MyAppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = homeNavGraphRoute,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        homeNavGraph(navController = navController)
        profileNavGraph(navController = navController)
        settingsNavGraph(navController = navController)
    }
}