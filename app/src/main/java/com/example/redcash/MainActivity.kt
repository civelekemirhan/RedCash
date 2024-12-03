package com.example.redcash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import com.example.redcash.feature.ui.SplashScreen
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
                SplashScreen()
            }
        }
    }
}
