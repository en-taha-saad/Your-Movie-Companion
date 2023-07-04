package com.example.cinema_tickets.screens.bottomnav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cinema_tickets.screens.BookingMovieScreen
import com.example.cinema_tickets.screens.ComingSoonScreen
import com.example.cinema_tickets.screens.HomeScreen
import com.example.cinema_tickets.screens.MovieDetailsScreen
import com.example.cinema_tickets.screens.NowShowingScreen
import com.example.cinema_tickets.screens.ProfileScreen
import com.example.cinema_tickets.screens.SearchScreen
import com.example.cinema_tickets.screens.TicketsScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController, startDestination = BottomBarScreen.NowShowing.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen(NowShowingScreen(navController), navController)
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

        composable(route = BottomBarScreen.MovieDetails.route) {
            BookingMovieScreen(navController)
        }

        composable(route = BottomBarScreen.NowShowing.route) {
            HomeScreen(NowShowingScreen(navController), navController)
        }
        composable(route = BottomBarScreen.ComingSoon.route) {
            HomeScreen(ComingSoonScreen(navController), navController)
        }

    }
}

