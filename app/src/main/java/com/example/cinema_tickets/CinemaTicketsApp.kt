package com.example.cinema_tickets

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cinema_tickets.screens.BookingMovieScreen
import com.example.cinema_tickets.screens.HomeScreen
import com.example.cinema_tickets.screens.MovieDetailsScreen
import com.example.cinema_tickets.ui.theme.CinematicketsTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CinemaTicketsApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController = navController)
        }
        composable("movieDetails") {
            MovieDetailsScreen(navController = navController)
        }
        composable("bookingMovie") {
            BookingMovieScreen(navController = navController)
        }
    }

    CinematicketsTheme {
        Scaffold {}
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CinemaTicketsAppPreview() {
    CinemaTicketsApp()
}