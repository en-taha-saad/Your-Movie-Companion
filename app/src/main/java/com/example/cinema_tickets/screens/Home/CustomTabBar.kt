package com.example.cinema_tickets.screens.Home

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun CustomTabBar() {
    val (selectedTab, onTabSelected) = remember { mutableStateOf(0) }

    Row(modifier = Modifier.padding(bottom = 16.dp, top = 32.dp)) {
        CustomTabButton(
            text = "Now Showing",
            selected = selectedTab == 0,
            onSelected = { onTabSelected(0) }
        )

        Spacer(modifier = Modifier.width(8.dp))

        CustomTabButton(
            text = "Coming Soon",
            selected = selectedTab == 1,
            onSelected = { onTabSelected(1) }
        )
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CustomTabBarPreview() {
    CustomTabBar()
}
