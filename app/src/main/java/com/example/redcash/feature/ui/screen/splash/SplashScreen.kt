package com.example.redcash.feature.ui.screen.splash


import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextMotion
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.redcash.common.component.AuthTemplate
import com.example.redcash.navigation.NavigationConstant
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SplashScreen(navController: NavController) {
    val infiniteTransition = rememberInfiniteTransition(label = "infinite transition")
    val scale by infiniteTransition.animateFloat(
        initialValue = 0.1f,
        targetValue = 0.8f,
        animationSpec = infiniteRepeatable(tween(1800)),
        label = "scale"
    )
    val scope= rememberCoroutineScope()
    AuthTemplate(true) {
            Text(
                "REDCASH",
                color = Color.White,
                fontSize = 40.sp,
                letterSpacing = 10.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.graphicsLayer {
                    scaleX = scale
                    scaleY = scale
                    transformOrigin = TransformOrigin.Center
                },
                style = LocalTextStyle.current.copy(textMotion = TextMotion.Animated)
            )

    }
    LaunchedEffect(Unit) {
        scope.launch {
            delay(1500)
            navController.navigate(NavigationConstant.ONBOARDING_SCREEN_ROUTE)
        }
    }

}