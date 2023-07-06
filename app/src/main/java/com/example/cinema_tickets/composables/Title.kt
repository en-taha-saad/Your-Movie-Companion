package com.example.cinema_tickets.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun Title(name: String) {
    Text(
        text = name,
        color = Color.Black,
        style = TextStyle(
            fontSize = 24.sp,
            letterSpacing = 0.15.sp,
            lineHeight = 32.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium
        )
    )
}
