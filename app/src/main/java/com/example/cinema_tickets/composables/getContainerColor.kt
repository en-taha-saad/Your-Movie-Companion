package com.example.cinema_tickets.composables

import androidx.compose.ui.graphics.Color

fun getContainerColor(rowSeats: List<Seat>): Color {
    return if (rowSeats[0].state == SeatState.Selected && rowSeats[1].state == SeatState.Selected) {
        Color(0xff3E1E14)
    } else if (rowSeats[0].state == SeatState.Busy || rowSeats[1].state == SeatState.Busy) {
        Color(0xff161616)
    } else if (rowSeats[0].state == SeatState.Available && rowSeats[1].state == SeatState.Available) {
        Color(0xff343434)
    } else {
        Color(0xff2C2C2C)
    }
}
