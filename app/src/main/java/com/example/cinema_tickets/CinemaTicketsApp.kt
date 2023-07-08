package com.example.cinema_tickets

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.cinema_tickets.screens.bottomnav.BottomBar
import com.example.cinema_tickets.screens.bottomnav.BottomBarScreen
import com.example.cinema_tickets.screens.bottomnav.BottomNavGraph
import com.example.cinema_tickets.ui.theme.CinematicketsTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CinemaTicketsApp() {
    val navController = rememberNavController()
    val navStackBackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navStackBackEntry?.destination
    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Search,
        BottomBarScreen.Tickets,
        BottomBarScreen.Profile
    )
    CinematicketsTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(), containerColor = Color.White,

            bottomBar = {
                if (currentDestination?.route != BottomBarScreen.MovieDetails.route && currentDestination?.route != BottomBarScreen.BookingMovie.route) BottomBar(
                    navController = navController,
                    currentDestination = currentDestination,
                    screens = screens
                )
            },
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                BottomNavGraph(navController = navController)
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CinemaTicketsAppPreview() {
    CinemaTicketsApp()
}