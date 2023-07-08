package com.example.cinema_tickets.screens.BottomNavBar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cinema_tickets.screens.BookingMovie.BookingMovieScreen
import com.example.cinema_tickets.screens.Home.HomeScreen
import com.example.cinema_tickets.screens.MovieDetails.MovieDetailsScreen
import com.example.cinema_tickets.screens.Others.ProfileScreen
import com.example.cinema_tickets.screens.Others.SearchScreen
import com.example.cinema_tickets.screens.Others.TicketsScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController, startDestination = BottomBarScreen.Home.route
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

