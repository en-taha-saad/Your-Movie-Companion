package com.example.cinema_tickets.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.cinema_tickets.ui.theme.SelectedDateOrTimeColor


@Composable
fun LabeledValue(label: String, value: String, extendedValue: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Row {
            Text(
                text = value, color = Color.Black, style = TextStyle(
                    fontWeight = FontWeight.Medium, fontSize = 14.sp
                )
            )
            if (extendedValue.isNotEmpty()) Text(
                text = extendedValue, color = SelectedDateOrTimeColor, style = TextStyle(
                    fontWeight = FontWeight.Medium, fontSize = 14.sp
                )
            )
        }
        Text(
            text = label, color = SelectedDateOrTimeColor, style = TextStyle(
                fontWeight = FontWeight.Medium, fontSize = 14.sp
            )
        )
    }
}
