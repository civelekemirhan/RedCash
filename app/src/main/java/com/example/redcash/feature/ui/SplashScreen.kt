package com.example.redcash.feature.ui


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.redcash.common.AuthTemplate

@Composable
fun SplashScreen() {
    AuthTemplate(true) {
            Text(
                "REDCASH",
                color = Color.White,
                fontSize = 40.sp,
                letterSpacing = 10.sp,
                fontWeight = FontWeight.SemiBold
            )
    }
}