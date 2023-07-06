package com.example.cinema_tickets.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.size.Scale
import com.example.cinema_tickets.R
import com.example.cinema_tickets.ui.theme.BrandColor
import com.example.cinema_tickets.ui.theme.SelectedDateOrTimeColor

@Composable
fun MovieDetailsBackgroundDesign(image: String) {
    Box {
        MovieImage(
            image, scale = Scale.FILL, modifier = Modifier.fillMaxWidth()

        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 16.dp, vertical = 32.dp
                ),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            CircularIcon(
                R.drawable.cancel,
                height = 46,
                padding = 8,
                backgroundColor = SelectedDateOrTimeColor.copy(alpha = 0.5f),
                onClick = { }
            )
            MovieTime(shownOnHome = true)

        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 190.dp),
            contentAlignment = Alignment.TopCenter,
        ) {
            CircularIcon(
                R.drawable.play,
                height = 54,
                padding = 12,
                backgroundColor = BrandColor,
                onClick = { }
            )
        }

    }
}

