package com.example.cinema_tickets.screens.bottomnav

import com.example.cinema_tickets.R


sealed class BottomBarScreen(
    val route: String, val icon: Int
) {


    object BookingMovie : BottomBarScreen(
        route = "bookingMovie",
        icon = 0,
    )

    object MovieDetails : BottomBarScreen(
        route = "movieDetails",
        icon = 0,
    )

    object NowShowing : BottomBarScreen(
        route = "nowShowing",
        icon = 0,
    )

    object ComingSoon : BottomBarScreen(
        route = "comingSoon",
        icon = 0,
    )

    object Home : BottomBarScreen(
        route = "home",
        icon = R.drawable.home,
    )

    object Search : BottomBarScreen(
        route = "search",
        icon = R.drawable.search,
    )

    object Tickets : BottomBarScreen(
        route = "ticket",
        icon = R.drawable.tickets,
    )

    object Profile : BottomBarScreen(
        route = "profile",
        icon = R.drawable.profile,
    )

}