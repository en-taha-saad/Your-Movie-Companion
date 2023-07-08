package com.example.cinema_tickets.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinema_tickets.R

@Composable
fun SeatRow(
    seats: List<Seat>,
    onSeatClick: (Seat) -> Unit,
    rotationDegree: Float,
    containerColor: Color
) {
    Box(
        modifier = Modifier
            .padding(bottom = 8.dp)
            .rotate(rotationDegree)
    ) {
        Icon(
            modifier = Modifier
                .width(108.dp)
                .height(42.dp)
                .fillMaxWidth(),
            painter = painterResource(id = R.drawable.seat_container_icon),
            contentDescription = "Seat container",
            tint = containerColor,
        )
        Row(
            modifier = Modifier.padding(start = 13.dp, top = 2.dp),
        ) {
            seats.forEach { seat ->
                SeatIcon(seat, onSeatClick)
                Spacer(modifier = Modifier.width(8.dp))
            }
        }
    }
}

