package com.example.cinema_tickets.screens.BookingMovie.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.cinema_tickets.R

@Composable
fun CinemaFilm(
    image: Int,
    modifier: Modifier = Modifier,
) {
    Image(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(3.5f / 1f),
        painter = painterResource(id = image),
        contentDescription = stringResource(R.string.app_name),
    )
}
