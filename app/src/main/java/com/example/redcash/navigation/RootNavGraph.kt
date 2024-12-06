package com.example.redcash.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun SetupNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = NavigationConstant.AUTH_NAV_GRAPH,
        route = NavigationConstant.ROOT_NAV_GRAPH
    ) {
        AuthNavGraph(navController = navController)
        ContentNavGraph(navController = navController)
    }


}