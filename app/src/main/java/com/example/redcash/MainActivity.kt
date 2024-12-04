package com.example.redcash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.graphics.toArgb
import androidx.navigation.compose.rememberNavController
import com.example.redcash.feature.ui.screen.splash.SplashScreen
import com.example.redcash.navigation.SetupNavGraph
import com.example.redcash.ui.theme.BackRed
import com.example.redcash.ui.theme.RedCashTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(BackRed.toArgb()),
            navigationBarStyle = SystemBarStyle.dark(BackRed.toArgb())
        )
        setContent {
            RedCashTheme {
                SetupNavGraph(navController = rememberNavController())
            }
        }
    }
}
