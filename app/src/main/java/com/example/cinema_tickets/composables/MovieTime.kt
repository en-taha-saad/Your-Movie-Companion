package com.example.cinema_tickets.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinema_tickets.R
import com.example.cinema_tickets.ui.theme.SelectedDateOrTimeColor

@Composable
fun MovieTime(shownOnHome: Boolean) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = if (shownOnHome) Modifier
            .clip(shape = RoundedCornerShape(24.dp))
            .background(SelectedDateOrTimeColor.copy(alpha = 0.5f))
            .padding(horizontal = 16.dp, vertical = 8.dp) else Modifier,
    ) {
        Icon(
            modifier = Modifier.height(18.dp),
            painter = painterResource(id = R.drawable.clock), contentDescription = "icon",
        )
        SpacerHorizentol4()
        Text(text = "2h 23m", color = if (shownOnHome) Color.White else Color.Black)
    }
}
