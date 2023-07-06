package com.example.cinema_tickets.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.cinema_tickets.R
import com.example.cinema_tickets.ui.theme.BrandColor


@Composable
fun MovieDetailsForegroundDesign(image: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(top = 330.dp)
            .clip(
                shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
            )
            .fillMaxSize()
            .background(color = Color.White)
            .padding(top = 24.dp)
    ) {
        Column(modifier = Modifier.padding(end = 54.dp, start = 54.dp, top = 24.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                LabeledValue(label = "IMDb", value = "6.8", extendedValue = "/10")
                LabeledValue(label = "Rotten Tomatoes", value = "63%", extendedValue = "")
                LabeledValue(label = "IGN", value = "4", extendedValue = "/10")
            }
            SpacerVertical24()
            Title(name = "Fantastic Beasts: The Secrets of Dumbledore")
        }
        SpacerVertical16()
        CategoriesBadges()
        LazyRow(
            modifier = Modifier.padding(start = 16.dp, top = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(10) {
                ProfileAvatar(painter = image)
            }
        }
        SpacerVertical16()
        Text(
            text = "Lorem ipsum dolor sit amet consectetur. Eleifend gravida pellentesque nam euismod in.",
            modifier = Modifier.padding(end = 24.dp, start = 24.dp),
            textAlign = TextAlign.Center,
        )
        SpacerVertical16()
        Button(
            onClick = { }, modifier = Modifier.height(50.dp), colors = ButtonDefaults.buttonColors(
                containerColor = BrandColor, contentColor = Color.White
            )
        ) {
            Row {
                Icon(
                    modifier = Modifier.height(18.dp),
                    painter = painterResource(id = R.drawable.booking), contentDescription = "icon",
                )
                SpacerHorizentol4()
                Text(text = "Booking", color = Color.White)
            }
        }
    }
}
