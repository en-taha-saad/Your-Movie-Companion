package com.example.cinema_tickets.screens.bottomnav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cinema_tickets.screens.BookingMovieScreen
import com.example.cinema_tickets.screens.HomeScreen
import com.example.cinema_tickets.screens.MovieDetailsScreen
import com.example.cinema_tickets.screens.ProfileScreen
import com.example.cinema_tickets.screens.SearchScreen
import com.example.cinema_tickets.screens.TicketsScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController, startDestination = BottomBarScreen.MovieDetails.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen(navController)
        }
        composable(route = BottomBarScreen.Search.route) {
            SearchScreen()
        }
        composable(route = BottomBarScreen.Tickets.route) {
            TicketsScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }

        composable(route = BottomBarScreen.MovieDetails.route) {
            MovieDetailsScreen(navController)
        }

        composable(route = BottomBarScreen.BookingMovie.route) {
            BookingMovieScreen(navController)
        }


    }
}

