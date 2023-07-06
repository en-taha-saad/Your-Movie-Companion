package com.example.cinema_tickets.composables

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.cinema_tickets.R

@Composable
fun ProfileAvatar(modifier: Modifier = Modifier, painter: String = "") {
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current).data(painter).crossfade(true).build(),
        placeholder = painterResource(R.drawable.ic_launcher_background),
        contentDescription = stringResource(R.string.app_name),
        contentScale = ContentScale.Crop,
        modifier = modifier
            .clip(CircleShape)
            .height(70.dp)
            .width(70.dp),
    )
}