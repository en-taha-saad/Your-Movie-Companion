package com.example.cinema_tickets.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinema_tickets.ui.theme.SelectedDateOrTimeColor


@Composable
fun TimesList(times: List<String>, selectedTime: String, onTimeSelected: (String) -> Unit) {
    LazyRow(
        modifier = listModifier,
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp),

        ) {
        items(times.size) { time ->
            TimeBadge(time = times[time],
                selected = selectedTime == times[time],
                onSelected = { onTimeSelected(times[time]) })
            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}


@Composable
fun TimeBadge(
    time: String, selected: Boolean, onSelected: () -> Unit
) {
    Box(modifier = Modifier
        .border(1.dp, SelectedDateOrTimeColor, shape = RoundedCornerShape(25.dp))
        .background(
            color = if (selected) SelectedDateOrTimeColor else Color.Transparent,
            shape = RoundedCornerShape(25.dp)
        )
        .clickable { onSelected() }
        .padding(horizontal = 16.dp, vertical = 12.dp),
        contentAlignment = Alignment.Center) {
        Text(
            text = time, style = TextStyle(
                color = if (selected) Color.White else Color(0xff1A2B43),
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )
        )
    }
}