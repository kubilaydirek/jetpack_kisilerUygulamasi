package com.kolaysoft.kisiler_app_jetpack.data.navgraph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kolaysoft.kisiler_app_jetpack.view.HomeScreen
import com.kolaysoft.kisiler_app_jetpack.view.PersonRegistrationScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "homeScreen") {
        composable("homeScreen") {
            HomeScreen(navController)
        }
        composable("personRegisteredScreen") {
            PersonRegistrationScreen(navController)
        }
    }
}