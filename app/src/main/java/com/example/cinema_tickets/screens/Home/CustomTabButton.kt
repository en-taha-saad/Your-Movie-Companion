package com.example.cinema_tickets.screens.Home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.cinema_tickets.ui.theme.BrandColor
import com.example.cinema_tickets.ui.theme.SelectedDateOrTimeColor

@Composable
fun CustomTabButton(
    text: String, selected: Boolean, onSelected: () -> Unit
) {
    Button(
        onClick = onSelected, colors = ButtonDefaults.buttonColors(
            containerColor = if (selected) BrandColor else Color.Transparent,
            contentColor = Color.White
        ), border = if (selected) BorderStroke(0.dp, Color.Transparent) else BorderStroke(
            1.dp, SelectedDateOrTimeColor
        ), shape = RoundedCornerShape(25.dp)
    ) {
        Text(text = text)
    }
}
