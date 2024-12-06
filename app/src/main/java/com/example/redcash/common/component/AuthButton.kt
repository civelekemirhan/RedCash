package com.example.redcash.common.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun AuthButton(onClick: () -> Unit, text: String = "Giriş Yap",height: Dp = 50.dp, width: Float = 0.6f) {
    Button(
        modifier = Modifier
            .background(Color.Transparent)
            .padding(8.dp, 16.dp)
            .height(height)
            .fillMaxWidth(width),
        onClick = { onClick() },
        shape = RoundedCornerShape(10.dp),
        contentPadding = PaddingValues()
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black),
            contentAlignment = Alignment.Center
        ){
            Text(text = text)
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AuthButtonPreview() {
    AuthButton(onClick = {})
}