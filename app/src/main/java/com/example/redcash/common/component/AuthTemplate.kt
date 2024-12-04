package com.example.redcash.common.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.redcash.ui.theme.BackRed

@Composable
fun AuthTemplate(isSplash: Boolean = false, content: @Composable () -> Unit) {
    Scaffold() { innerPadding ->
        if (isSplash) {

            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .background(BackRed)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                content()
            }
        } else {
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .background(BackRed)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.6f)) {
                    content()
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.3f),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        "REDCASH",
                        color = Color.White,
                        fontSize = 35.sp,
                        letterSpacing = 5.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                }


            }
        }

    }


}