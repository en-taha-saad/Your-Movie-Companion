package com.example.cinema_tickets.screens.Home


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.size.Scale
import com.example.cinema_tickets.SharedComposables.CategoriesBadges
import com.example.cinema_tickets.screens.MovieDetails.composables.MovieImage
import com.example.cinema_tickets.screens.MovieDetails.composables.MovieTime
import com.example.cinema_tickets.SharedComposables.SpacerVertical16
import com.example.cinema_tickets.SharedComposables.SpacerVertical24
import com.example.cinema_tickets.SharedComposables.Title

@Composable
fun HomeScreen(navController: NavHostController) {
    val sliderList = listOf(
        "https://i.ibb.co/2FgBw40/design-1.png",
        "https://i.ibb.co/2FgBw40/design-1.png",
        "https://i.ibb.co/2FgBw40/design-1.png",
    )

    Box {

        MovieImage(
            modifier = Modifier
                .fillMaxWidth()
                .blur(50.dp, 50.dp),
            image = "https://i.ibb.co/bsxSbJd/Frame-3.png",
            scale = Scale.FILL,
        )

        Column(
            modifier = Modifier.fillMaxSize(),
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
            SpacerVertical16()
            CategoriesBadges()
        }
    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}