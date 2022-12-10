package com.example.navigationsample.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarDestination(
    val graphRoute: String,
    val label: String,
    val icon: ImageVector
) {
    object Home : BottomBarDestination(
        graphRoute = "home_graph",
        label = "Home",
        icon = Icons.Filled.Home
    )

    object Profile : BottomBarDestination(
        graphRoute = "profile_graph",
        label = "Profile",
        icon = Icons.Filled.Person
    )

    object Settings : BottomBarDestination(
        graphRoute = "settings_graph",
        label = "Settings",
        icon = Icons.Filled.Settings
    )
}