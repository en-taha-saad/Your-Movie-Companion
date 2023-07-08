package com.example.cinema_tickets.SharedComposables

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.cinema_tickets.ui.theme.SelectedDateOrTimeColor

@Composable
fun CategoryBadge(name: String) {
    Box(
        modifier = Modifier
            .border(1.dp, SelectedDateOrTimeColor, shape = RoundedCornerShape(24.dp))
            .padding(horizontal = 16.dp, vertical = 8.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text = name, color = Color.Black)
    }
}