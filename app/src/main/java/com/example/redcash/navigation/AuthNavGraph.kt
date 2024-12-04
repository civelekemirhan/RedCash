package com.example.redcash.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.redcash.feature.ui.screen.onboarding.OnBoardingScreen
import com.example.redcash.feature.ui.screen.splash.SplashScreen

fun NavGraphBuilder.AuthNavGraph(navController: NavHostController) {

    navigation(
        startDestination = NavigationConstant.SPLASH_SCREEN_ROUTE,
        route = NavigationConstant.AUTH_NAV_GRAPH
    ) {
        composable(route = NavigationConstant.SPLASH_SCREEN_ROUTE) {
            SplashScreen(navController)
        }
        composable(route = NavigationConstant.ONBOARDING_SCREEN_ROUTE) {
            OnBoardingScreen(navController)
        }


    }
}