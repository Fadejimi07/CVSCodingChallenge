package com.example.cvscodingchallenge.screens

import androidx.compose.runtime.Composable
import coil3.compose.AsyncImage
import com.example.cvscodingchallenge.model.PhotoItem

@Composable
fun PhotoScreen(photoItem: PhotoItem) {
    AsyncImage(
        model = photoItem.link,
        contentDescription = photoItem.description
    )
}