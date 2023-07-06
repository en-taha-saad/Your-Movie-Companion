package com.example.cinema_tickets.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinema_tickets.ui.theme.SelectedDateOrTimeColor

@Composable
fun CircularIcon(
    image: Int, onClick: () -> Unit = {}, height: Int, padding: Int, backgroundColor: Color
) {
    Box(
        modifier = Modifier
            .clickable {
                onClick()
            }
            .height(height.dp)
            .clip(shape = CircleShape)
            .background(backgroundColor)
            .padding(padding.dp),
    ) {
        Icon(
            modifier = Modifier.height(36.dp),
            painter = painterResource(id = image),
            contentDescription = "icon",
            tint = Color.White
        )
    }
}
