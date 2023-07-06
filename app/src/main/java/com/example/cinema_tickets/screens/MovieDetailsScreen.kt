package com.example.cinema_tickets.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.size.Scale
import com.example.cinema_tickets.R
import com.example.cinema_tickets.composables.CircularIcon
import com.example.cinema_tickets.composables.MovieDetailsBackgroundDesign
import com.example.cinema_tickets.composables.MovieDetailsForegroundDesign
import com.example.cinema_tickets.composables.MovieImage
import com.example.cinema_tickets.composables.MovieTime
import com.example.cinema_tickets.composables.Title
import com.example.cinema_tickets.ui.theme.BrandColor
import com.example.cinema_tickets.ui.theme.SelectedDateOrTimeColor

@Composable
fun MovieDetailsScreen(navController: NavHostController) {
    val image = "https://i.ibb.co/Rg0Rczw/movie-image.jpg"
    Box() {
        MovieDetailsBackgroundDesign(image)
        MovieDetailsForegroundDesign()
    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MovieDetailsPreview() {
    MovieDetailsScreen(navController = rememberNavController())
}