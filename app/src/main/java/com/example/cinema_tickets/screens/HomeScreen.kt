package com.example.cinema_tickets.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.cinema_tickets.composables.BuildLoginSlider
import com.example.cinema_tickets.composables.CustomTabBar

@Composable
fun HomeScreen(navController: NavController) {
    val sliderList = listOf(
        "https://i.ibb.co/2FgBw40/design-1.png",
        "https://i.ibb.co/2FgBw40/design-1.png",
        "https://i.ibb.co/2FgBw40/design-1.png",
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        CustomTabBar()
        Spacer(modifier = Modifier.height(16.dp))
        BuildLoginSlider(sliderList)
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}