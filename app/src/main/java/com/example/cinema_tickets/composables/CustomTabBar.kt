package com.example.cinema_tickets.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cinema_tickets.screens.bottomnav.BottomBarScreen


@Composable
fun CustomTabBar(navController: NavHostController) {
    // Define the tab states
    val (selectedTab, onTabSelected) = rememberSaveable { mutableStateOf(BottomBarScreen.NowShowing.route) }

    Row(modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)) {
        CustomTabButton(text = "Now Showing",
            selected = selectedTab == BottomBarScreen.NowShowing.route,
            onSelected = {
                onTabSelected(BottomBarScreen.NowShowing.route)
                navController.navigate(BottomBarScreen.NowShowing.route)
            })
        Spacer(modifier = Modifier.width(8.dp))
        CustomTabButton(text = "Coming Soon",
            selected = selectedTab == BottomBarScreen.ComingSoon.route,
            onSelected = {
                onTabSelected(BottomBarScreen.ComingSoon.route)
                navController.navigate(BottomBarScreen.ComingSoon.route)
            })
    }
    Spacer(modifier = Modifier.height(16.dp))
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CustomTabBarPreview() {
    CustomTabBar(rememberNavController())
}