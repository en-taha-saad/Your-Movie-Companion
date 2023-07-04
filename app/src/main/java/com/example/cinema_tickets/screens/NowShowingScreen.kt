package com.example.cinema_tickets.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.cinema_tickets.composables.BuildLoginSlider

@Composable
fun NowShowingScreen(navController: NavHostController) {
    val sliderList = listOf(
        "https://i.ibb.co/2FgBw40/design-1.png",
        "https://i.ibb.co/2FgBw40/design-1.png",
        "https://i.ibb.co/2FgBw40/design-1.png",
    )
    Column {
        BuildLoginSlider(sliderList)

    }
}