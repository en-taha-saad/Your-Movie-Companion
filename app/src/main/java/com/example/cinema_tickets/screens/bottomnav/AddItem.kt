package com.example.cinema_tickets.screens.bottomnav

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import com.example.cinema_tickets.ui.theme.BackgroundColor
import com.example.cinema_tickets.ui.theme.BadgeBackgroundColor
import com.example.cinema_tickets.ui.theme.BrandColor

@Composable
fun AddItem(
    isTickets: Boolean,
    screen: BottomBarScreen, currentDestination: NavDestination?, onClick: () -> Unit = {},
) {
    val selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true

    val background = if (selected) BrandColor else Color.Transparent

    val contentColor = if (selected) BackgroundColor else BadgeBackgroundColor

    Box(
        modifier = Modifier
            .height(48.dp)
            .clip(CircleShape)
            .background(background)
            .clickable(onClick = onClick)
            .padding(12.dp)
    ) {
        if (isTickets)
            Text(
                modifier = Modifier.padding(bottom = 12.dp, start = 20.dp),
                text = "23", color = Color.Red,
                style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Black
                ),
            )
        Icon(
            painter = painterResource(id = screen.icon),
            contentDescription = "icon",
            tint = contentColor
        )
    }
}
