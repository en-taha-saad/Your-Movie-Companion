package com.example.cinema_tickets.screens.BookingMovie.composables

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.cinema_tickets.screens.BookingMovie.CinemaViewModel

@Composable
fun CinemaSeats(
    viewModel: CinemaViewModel = hiltViewModel(), modifier: Modifier = Modifier,
) {
    val state by viewModel.state.collectAsState()
    val rowsOfSeats = state.chunked(2)
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = modifier.fillMaxWidth(),
        contentPadding = PaddingValues(
            start = 16.dp,
            top = 16.dp,
            end = 8.dp,
            bottom = 16.dp,
        )
    ) {
        itemsIndexed(rowsOfSeats) { index, rowSeats ->
            val containerColor: Color = getContainerColor(rowSeats)
            when (index % 3) {
                0 -> SeatRow(rowSeats, viewModel::onSeatClick, 8f, containerColor)
                2 -> SeatRow(rowSeats, viewModel::onSeatClick, -8f, containerColor)
                else -> SeatRow(rowSeats, viewModel::onSeatClick, 0f, containerColor)
            }
        }
    }
}
