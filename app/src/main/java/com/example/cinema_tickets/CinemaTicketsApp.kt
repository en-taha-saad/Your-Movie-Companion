package com.example.cinema_tickets

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.cinema_tickets.screens.bottomnav.BottomBar
import com.example.cinema_tickets.screens.bottomnav.BottomNavGraph
import com.example.cinema_tickets.ui.theme.CinematicketsTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CinemaTicketsApp() {
    val navController = rememberNavController()
    CinematicketsTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = Color.White,
            bottomBar = { BottomBar(navController = navController) },
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