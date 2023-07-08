package com.example.cinema_tickets.screens.MovieDetails


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.zIndex
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import com.example.cinema_tickets.screens.MovieDetails.composables.MovieDetailsBackgroundDesign
import com.example.cinema_tickets.screens.MovieDetails.composables.MovieDetailsForegroundDesign

@Composable
fun MovieDetailsScreen(navController: NavHostController) {
    val image = "https://i.ibb.co/Rg0Rczw/movie-image.jpg"
    Box(modifier = Modifier.fillMaxSize()) {
        MovieDetailsBackgroundDesign(image, navController)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .zIndex(1f)
                .verticalScroll(rememberScrollState())
        ) {
            MovieDetailsForegroundDesign(image, navController)
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MovieDetailsPreview() {
    MovieDetailsScreen(navController = rememberNavController())
}