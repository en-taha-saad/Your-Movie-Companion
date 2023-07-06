package com.example.cinema_tickets.composables

import androidx.compose.foundation.clickable
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Scale
import com.example.cinema_tickets.R
import com.example.cinema_tickets.screens.bottomnav.BottomBarScreen
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerScope
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import kotlin.math.absoluteValue

@Composable
@OptIn(ExperimentalPagerApi::class)
fun PagerScope.PagerCard(
    page: Int, navController: NavHostController, sliderList: List<String>
) {
    Card(
        colors = CardDefaults.cardColors(Color.DarkGray),
        shape = RoundedCornerShape(25.dp),
        modifier = Modifier
            .graphicsLayer {
                val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue
                lerp(
                    start = 0.92f, stop = 1f, fraction = 1f - pageOffset.coerceIn(0f, 1f)
                ).also { scale ->
                    scaleX = scale
                    scaleY = scale
                }
            }
            .clickable { navController.navigate(BottomBarScreen.MovieDetails.route) },
    ) {
        MovieImage(sliderList[page], scale = Scale.FIT)
    }
}

