package com.example.cinema_tickets.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinema_tickets.ui.theme.SelectedDateOrTimeColor



@Composable
fun DaysList(days: List<Day>, selectedDay: Day, onDaySelected: (Day) -> Unit) {
    LazyRow(
        modifier = listModifier,
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp),
    ) {
        items(days.size) { day ->
            DayBadge(day = days[day],
                selected = selectedDay.dayNum == days[day].dayNum,
                onSelected = { onDaySelected(days[day]) })
            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}

@Composable
fun DayBadge(
    day: Day, selected: Boolean, onSelected: () -> Unit
) {
    Box(modifier = Modifier
        .border(1.dp, SelectedDateOrTimeColor, shape = RoundedCornerShape(18.dp))
        .background(
            color = if (selected) SelectedDateOrTimeColor else Color.Transparent,
            shape = RoundedCornerShape(18.dp)
        )
        .clickable { onSelected() }
        .padding(horizontal = 16.dp, vertical = 12.dp),
        contentAlignment = Alignment.Center) {
        Column {
            Text(
                text = day.dayNum.toString(), style = TextStyle(
                    color = if (selected) Color.White else Color(0xff1A2B43),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                text = day.dayStr, style = TextStyle(
                    color = if (selected) Color(0xffCEC9C1) else Color(0xff77808B),
                    fontSize = 12.sp,
                )
            )
        }
    }
}