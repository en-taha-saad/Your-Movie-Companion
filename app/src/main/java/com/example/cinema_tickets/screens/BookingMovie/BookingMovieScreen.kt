package com.example.cinema_tickets.screens.BookingMovie

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cinema_tickets.screens.BookingMovie.composables.BookingMovieBackgroundDesign
import com.example.cinema_tickets.screens.BookingMovie.composables.BookingMovieForegroundDesign


@Composable
fun BookingMovieScreen(navController: NavHostController) {
    BookingMovieBackgroundDesign(navController)
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
        ) {
            BookingMovieForegroundDesign()
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BookingMoviePreview() {
    BookingMovieScreen(navController = rememberNavController())
}