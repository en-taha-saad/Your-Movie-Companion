package com.example.cinema_tickets.screens.BookingMovie.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinema_tickets.R

@Composable
fun SeatIcon(seat: Seat, onSeatClick: (Seat) -> Unit) {
    Icon(
        painter = painterResource(
            id = when (seat.state) {
                SeatState.Available -> R.drawable.available_chair
                SeatState.Busy -> R.drawable.buzy_chair
                SeatState.Selected -> R.drawable.taken_chair
            },
        ),
        tint = Color.Unspecified,
        contentDescription = "Seat ${seat.id}",
        modifier = Modifier
            .padding(end = 8.dp)
            .size(32.dp)
            .clickable { onSeatClick(seat) })
}
