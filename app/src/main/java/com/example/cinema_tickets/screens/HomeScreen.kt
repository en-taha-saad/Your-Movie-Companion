package com.example.cinema_tickets.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.lerp
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Scale
import com.example.cinema_tickets.CinemaTicketsApp
import com.example.cinema_tickets.R

@Composable
fun HomeScreen(navController: NavController) {
    Column {

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BuildLoginSlider() {
    val pagerState = rememberPagerState(initialPage = 1)
    val sliderList = listOf<String>()

    HorizontalPager(
        pageCount = sliderList.size,
        state = pagerState,
        contentPadding = PaddingValues(horizontal = 150.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) { page ->
        Card(colors = CardDefaults.cardColors(Color.Transparent),
            shape = RoundedCornerShape(10.dp),
            elevation = CardDefaults.cardElevation(0.dp),
            modifier = Modifier.graphicsLayer {
                val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue
                scaleX = 0.85f
                scaleY = 0.85f
//                lerp(
//                    start = 0.85f, stop = 1f, fraction = 1f - pageOffset.coerceIn(0f, 1f)
//                ).also { scale ->
//                    scaleX = scale
//                    scaleY = scale
//                }
//                alpha = lerp(
//                    start = 0.5f, stop = 1f, fraction = 1f - pageOffset.coerceIn(0f, 1f)
//                )
            }

            // .aspectRatio(0.5f)
        ) {
            AsyncImage(model = ImageRequest.Builder(LocalContext.current).data(sliderList[page])
                .crossfade(true).scale(Scale.FILL).build(),
                placeholder = painterResource(R.drawable.ic_launcher_background),
                contentDescription = stringResource(R.string.app_name),
                contentScale = ContentScale.Crop,
                modifier = Modifier.offset {
                    // Use pageOffset here:
                    IntOffset(
                        x = (70.dp * pageOffset).roundToPx(),
                        y = 0,
                    )
                }
               )
        }

    }
}