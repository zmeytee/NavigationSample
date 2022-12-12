package com.example.settings.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.core.ui.TestProfileNavArg
import com.example.core.ui.utils.navigateSingleTop
import com.example.settings.SettingsScreen
import com.example.settings.SettingsScreen2
import com.example.settings.SettingsScreen3

const val settingsNavGraphRoute = "settings_nav_graph"

private const val settingsRoute = "settings"
private const val settings2Route = "settings2"
private const val settings3Route = "settings3"

private fun NavController.navigateToSettings2() {
    navigateSingleTop(settings2Route)
}

private fun NavController.navigateToSettings3(
    id: Long,
    name: String,
    profile: TestProfileNavArg,
) {
    this.currentBackStackEntry?.arguments?.apply {
        putParcelable("profile", profile)
    }
    navigateSingleTop("$settings3Route/$id?name=$name")
}

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
fun NavGraphBuilder.settingsNavGraph(navController: NavController) {
    navigation(startDestination = settingsRoute, route = settingsNavGraphRoute) {
        composable(settingsRoute) {
            SettingsScreen(
                navigateToSettings2 = {
                    navController.navigateToSettings2()
                },
                navigateToSettings3 = navController::navigateToSettings3,
            )
        }
        composable(settings2Route) {
            SettingsScreen2(
                navigateToSettings3 = navController::navigateToSettings3,
                navigateBack = {
                    navController.popBackStack()
                },
            )
        }
        composable(
            route = "$settings3Route/{id}?name={name}&profile={profile}",
            arguments = listOf(
                navArgument("id") {
                    type = NavType.LongType
                },
                navArgument("name") {
                    type = NavType.StringType
                    defaultValue = "noname"
                },
            )
        ) {
            val id = it.arguments?.getLong("id") ?: 0L
            val name = it.arguments?.getString("name").orEmpty()
            val profile = navController.previousBackStackEntry?.arguments
                ?.getParcelable("profile", TestProfileNavArg::class.java)

            SettingsScreen3(
                id = id,
                name = name,
                profile = profile,
                navigateBack = {
                    navController.popBackStack()
                },
            )
        }
    }
}