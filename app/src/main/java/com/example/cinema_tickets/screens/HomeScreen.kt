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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cinema_tickets.composables.BuildLoginSlider
import com.example.cinema_tickets.composables.CategoriesBadges
import com.example.cinema_tickets.composables.CustomTabBar
import com.example.cinema_tickets.composables.MovieTime
import com.example.cinema_tickets.composables.SpacerVertical24
import com.example.cinema_tickets.composables.Title

@Composable
fun HomeScreen(navController: NavHostController) {
    val sliderList = listOf(
        "https://i.ibb.co/2FgBw40/design-1.png",
        "https://i.ibb.co/2FgBw40/design-1.png",
        "https://i.ibb.co/2FgBw40/design-1.png",
    )
    val backgroundColors = listOf(
        Color(0xffffffff),
        Color(0xffffffff),
        Color(0xffffffff),
        Color(0xffffffff),
        Color(0xFFFFFFFF),
        Color(0xff000000),
        Color(0xff485636),
        Color(0xffC96720),
        Color(0xff556A3A),
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.sweepGradient(colors = backgroundColors),
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        CustomTabBar()
        Spacer(modifier = Modifier.height(16.dp))
        BuildLoginSlider(sliderList, navController)
        SpacerVertical24()
        MovieTime(shownOnHome = false)
        SpacerVertical24()
        Title("Fantastic Beasts: The Secrets of Dumbledore")
        CategoriesBadges()
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}