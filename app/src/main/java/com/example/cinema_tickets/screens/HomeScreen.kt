package com.example.cinema_tickets.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Scale
import com.example.cinema_tickets.R
import com.example.cinema_tickets.composables.BuildLoginSlider
import com.example.cinema_tickets.composables.CategoriesBadges
import com.example.cinema_tickets.composables.CustomTabBar
import com.example.cinema_tickets.composables.MovieImage
import com.example.cinema_tickets.composables.MovieTime
import com.example.cinema_tickets.composables.SpacerVertical16
import com.example.cinema_tickets.composables.SpacerVertical24
import com.example.cinema_tickets.composables.Title
import com.example.cinema_tickets.screens.bottomnav.BottomNavGraph

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