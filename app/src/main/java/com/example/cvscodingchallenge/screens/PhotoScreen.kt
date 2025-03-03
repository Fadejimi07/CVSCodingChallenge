package com.example.cvscodingchallenge.screens

import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil3.compose.AsyncImage
import com.example.cvscodingchallenge.model.PhotoItem

@Composable
fun PhotoScreen(
    photoItem: PhotoItem,
    photoItemSelected: (item: PhotoItem) -> Unit,
) {
    AsyncImage(
        model = photoItem.link,
        contentDescription = photoItem.description,
        modifier = Modifier.clickable {
            photoItemSelected(photoItem)
        }
    )
}