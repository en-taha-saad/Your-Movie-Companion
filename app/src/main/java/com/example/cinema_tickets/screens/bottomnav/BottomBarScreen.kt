package com.example.cinema_tickets.screens.bottomnav

import com.example.cinema_tickets.R


sealed class BottomBarScreen(
    val route: String, val icon: Int
) {

    object Home : BottomBarScreen(
        route = "home",
        icon = R.drawable.ic_launcher_foreground,
    )

    object Search : BottomBarScreen(
        route = "search",
        icon = R.drawable.ic_launcher_foreground,
    )

    object Tickets : BottomBarScreen(
        route = "ticket",
        icon = R.drawable.ic_launcher_foreground,
    )

    object Profile : BottomBarScreen(
        route = "profile",
        icon = R.drawable.ic_launcher_foreground,
    )

}