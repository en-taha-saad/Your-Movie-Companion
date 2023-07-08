package com.example.cinema_tickets.screens.BookingMovie

import com.example.cinema_tickets.screens.BookingMovie.composables.Day
import com.example.cinema_tickets.screens.BookingMovie.composables.Seat

data class BookingUiState(
    var seats: List<Seat> = listOf(),
    val availableDays: List<Day> = listOf(),
    val availableHours: List<String> = listOf(),
    val selectedDay: Day = Day(
        dayNum = 0,
        dayStr = "",
    ),
    val selectedHour: String = "",
)
