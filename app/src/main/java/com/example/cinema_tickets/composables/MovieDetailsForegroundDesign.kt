package com.example.cinema_tickets.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MovieDetailsForegroundDesign() {
    Column(
        modifier = Modifier
            .padding(top = 390.dp)
            .clip(
                shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
            )
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Title(name = "Fantastic Beasts: The Secrets of Dumbledore")
    }
}
