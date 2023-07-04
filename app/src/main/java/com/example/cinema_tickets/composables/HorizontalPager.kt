package com.example.cinema_tickets.composables

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Scale
import com.example.cinema_tickets.R
import com.example.cinema_tickets.screens.HomeScreen
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import com.google.accompanist.pager.rememberPagerState
import kotlin.math.absoluteValue


@OptIn(ExperimentalPagerApi::class)
@Composable
fun BuildLoginSlider(sliderList: List<String>) {
    val pagerState = rememberPagerState(initialPage = 1)
    HorizontalPager(
        count = sliderList.size,
        state = pagerState,
        contentPadding = PaddingValues(horizontal = 75.dp),
        modifier = Modifier.height(380.dp),
    ) { page ->
        val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue
        Card(
            colors = CardDefaults.cardColors(Color.DarkGray),
            shape = RoundedCornerShape(25.dp),
            modifier = Modifier.graphicsLayer {
                lerp(
                    start = 0.92f, stop = 1f, fraction = 1f - pageOffset.coerceIn(0f, 1f)
                ).also { scale ->
                    scaleX = scale
                    scaleY = scale
                }
            },
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current).data(sliderList[page])
                    .crossfade(true).scale(Scale.FIT).build(),
                placeholder = painterResource(R.drawable.ic_launcher_background),
                contentDescription = stringResource(R.string.app_name),
            )
        }
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
        )
    )
}