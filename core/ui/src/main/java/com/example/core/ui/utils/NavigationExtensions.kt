package com.example.core.ui.utils

import androidx.navigation.NavController
import androidx.navigation.NavOptionsBuilder

fun NavController.navigateSingleTop(route: String, builder: NavOptionsBuilder.() -> Unit) {
    navigate(route) {
        builder()
        launchSingleTop = true
    }
}

fun NavController.navigateSingleTop(route: String) {
    navigate(route) {
        launchSingleTop = true
    }
}