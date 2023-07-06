package com.example.cinema_tickets.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CategoriesBadges() {
    Row(
        modifier = Modifier.padding(16.dp)
    ) {
        CategoryBadge(name = "Fantasy")
        SpacerHorizentol4()
        CategoryBadge(name = "Adventure")
    }
}