package com.example.cinema_tickets.composables

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun BuildLoginSlider(sliderList: List<String>, navController: NavHostController) {
    val pagerState = rememberPagerState(initialPage = 1)
    HorizontalPager(
        count = sliderList.size,
        state = pagerState,
        contentPadding = PaddingValues(horizontal = 75.dp),
        modifier = Modifier.height(380.dp),
    ) { page ->
        PagerCard(page, navController, sliderList)
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BuildLoginSliderPreview() {
    BuildLoginSlider(
        sliderList = listOf(
            "https://i.ibb.co/2FgBw40/design-1.png",
            "https://i.ibb.co/2FgBw40/design-1.png",
            "https://i.ibb.co/2FgBw40/design-1.png"
        ), navController = rememberNavController()
    )
}