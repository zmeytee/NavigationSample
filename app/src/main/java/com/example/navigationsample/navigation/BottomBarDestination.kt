package com.example.navigationsample.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.feature.home.navigation.homeNavGraphRoute
import com.example.feature.profile.navigation.profileNavGraphRoute
import com.example.settings.navigation.settingsNavGraphRoute

sealed class BottomBarDestination(
    val graphRoute: String,
    val label: String,
    val icon: ImageVector
) {
    object Home : BottomBarDestination(
        graphRoute = homeNavGraphRoute,
        label = "Home",
        icon = Icons.Filled.Home
    )

    object Profile : BottomBarDestination(
        graphRoute = profileNavGraphRoute,
        label = "Profile",
        icon = Icons.Filled.Person
    )

    object Settings : BottomBarDestination(
        graphRoute = settingsNavGraphRoute,
        label = "Settings",
        icon = Icons.Filled.Settings
    )
}