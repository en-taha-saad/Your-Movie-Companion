package com.example.cinema_tickets.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cinema_tickets.R
import com.example.cinema_tickets.composables.BuildLoginSlider
import com.example.cinema_tickets.composables.CategoryBadge
import com.example.cinema_tickets.composables.CustomTabBar
import com.example.cinema_tickets.composables.SpacerHorizentol4
import com.example.cinema_tickets.composables.SpacerVertical24
import com.example.cinema_tickets.ui.theme.SelectedDateOrTimeColor

@Composable
fun HomeScreen(navController: NavHostController) {
    val sliderList = listOf(
        "https://i.ibb.co/2FgBw40/design-1.png",
        "https://i.ibb.co/2FgBw40/design-1.png",
        "https://i.ibb.co/2FgBw40/design-1.png",
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.sweepGradient(
                    colors = listOf(
                        Color(0xffffffff),
                        Color(0xffffffff),
                        Color(0xffffffff),
                        Color(0xffffffff),
                        Color(0xFFFFFFFF),
                        Color(0xff000000),
                        Color(0xff485636),
                        Color(0xffC96720),
                        Color(0xff556A3A),
                    )
                ),

                ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        CustomTabBar()
        Spacer(modifier = Modifier.height(16.dp))
        BuildLoginSlider(sliderList, navController)
        SpacerVertical24()
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                modifier = Modifier.height(18.dp),
                painter = painterResource(id = R.drawable.clock), contentDescription = "icon",
            )
            SpacerHorizentol4()
            Text(text = "2h 23m", color = Color.Black)
        }
        SpacerVertical24()
        Text(
            text = "Fantastic Beasts: The Secrets of Dumbledore",
            color = Color.Black,
            style = TextStyle(
                fontSize = 24.sp,
                letterSpacing = 0.15.sp,
                lineHeight = 32.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Medium
            )
        )
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            CategoryBadge(name = "Fantasy")
            SpacerHorizentol4()
            CategoryBadge(name = "Adventure")
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}