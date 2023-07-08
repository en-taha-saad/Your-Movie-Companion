package com.example.cinema_tickets.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.cinema_tickets.R
import com.example.cinema_tickets.screens.BookingMovieScreen.BookingMovieScreen
import com.example.cinema_tickets.ui.theme.BrandColor
import com.example.cinema_tickets.ui.theme.SelectedDateOrTimeColor

@Composable
fun BookingMovieBackgroundDesign() {
    Box(
        modifier = Modifier.background(Color.Black)
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 16.dp, end = 16.dp, top = 32.dp, bottom = 16.dp
                    ),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top,
            ) {
                CircularIcon(R.drawable.cancel,
                    height = 46,
                    padding = 8,
                    backgroundColor = SelectedDateOrTimeColor.copy(alpha = 0.5f),
                    onClick = { })
                Box {}
            }
            CinemaFilm(R.drawable.header)
            CinemaSeats()
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                SeatStatus(text = "Available", stateColor = Color.White)
                SeatStatus(text = "Taken", stateColor = Gray)
                SeatStatus(text = "Selected", stateColor = BrandColor)
            }
            SpacerVertical16()
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BookingMovieBackgroundDesignPreview() {
    BookingMovieScreen(navController = rememberNavController())
}
