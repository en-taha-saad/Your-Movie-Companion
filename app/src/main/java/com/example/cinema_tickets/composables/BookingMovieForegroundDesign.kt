package com.example.cinema_tickets.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.cinema_tickets.R
import com.example.cinema_tickets.screens.BookingMovieScreen.BookingMovieScreen
import com.example.cinema_tickets.ui.theme.BrandColor


@Composable
fun BookingMovieForegroundDesign() {
    val days = listOf(
        Day(11, "Mon"),
        Day(12, "Tue"),
        Day(13, "Wed"),
        Day(14, "Thu"),
        Day(15, "Fri"),
        Day(16, "Sat"),
        Day(17, "Sun"),
        Day(21, "Mon"),
        Day(22, "Tue"),
        Day(23, "Wed"),
        Day(24, "Thu"),
        Day(25, "Fri"),
        Day(26, "Sat"),
        Day(27, "Sun"),
    )
    val times = listOf(
        "10:00",
        "11:00",
        "12:00",
        "01:00",
        "02:00",
        "03:00",
        "04:00",
        "05:00",
        "06:00",
        "07:00",
        "08:00",
        "09:00",
        "10:00",
        "11:00",
        "12:00",
    )
    val (selectedDay, onDaySelected) = remember { mutableStateOf(days[1]) }
    val (selectedTime, onTimeSelected) = remember { mutableStateOf(times[1]) }

    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .padding(top = 540.dp)
            .fillMaxSize()
            .clip(
                shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
            )
            .background(color = Color.White)
            .padding(vertical = 16.dp),
    ) {
        DaysList(days = days, selectedDay = selectedDay, onDaySelected = onDaySelected)
        SpacerVertical24()
        TimesList(times = times, selectedTime = selectedTime, onTimeSelected = onTimeSelected)
        SpacerVertical24()
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "$ 100.00", style = TextStyle(
                        color = Color(0xff1A2B43), fontSize = 24.sp, fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "4 Tickets", style = TextStyle(
                        fontSize = 12.sp, fontWeight = FontWeight.Bold, color = Color(0xff77808B)
                    )
                )

            }
            Button(
                onClick = { },
                modifier = Modifier.height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = BrandColor, contentColor = Color.White
                )
            ) {
                Row {
                    Icon(
                        modifier = Modifier.height(18.dp),
                        painter = painterResource(id = R.drawable.booking),
                        contentDescription = "icon",
                    )
                    SpacerHorizentol4()
                    Text(text = "Buy tickets", color = Color.White)
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BookingMovieForegroundDesignPreview() {
    BookingMovieScreen(navController = rememberNavController())
}



