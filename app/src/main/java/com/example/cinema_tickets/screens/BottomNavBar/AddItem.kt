package com.example.cinema_tickets.screens.BottomNavBar

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
fun AddItem0(
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
            Box(
                modifier = Modifier
                    .height(24.dp)
                    .clip(CircleShape)
                    .background(Color.Red)
                    .padding(4.dp)
            ) {
                Text(
                    modifier = Modifier.padding(bottom = 12.dp, start = 20.dp),
                    text = "23", color = Color.White,
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
        Icon(
            painter = painterResource(id = screen.icon),
            contentDescription = "icon",
            tint = contentColor
        )
    }
}


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
        Icon(
            painter = painterResource(id = screen.icon),
            contentDescription = "icon",
            tint = contentColor
        )

        if (isTickets) {
            Box(
                modifier = Modifier
                    .padding(start = 8.dp, bottom = 8.dp)
                    .align(Alignment.TopCenter)
                    .height(18.dp)
                    .width(18.dp)
                    .clip(CircleShape)
                    .background(Color.Red)

            ) {
                Text(
                    text = "23",
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 8.sp,
                        fontWeight = FontWeight.Black
                    ),
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
    }
}
