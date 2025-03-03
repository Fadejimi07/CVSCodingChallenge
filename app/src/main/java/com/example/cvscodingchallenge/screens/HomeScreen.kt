package com.example.cvscodingchallenge.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.cvscodingchallenge.model.PhotoItem

@Composable
fun HomeScreen(
    photoItems: List<PhotoItem>,
    searchQuery: String,
    updateSearchQuery: (text: String) -> Unit,
    photoItemSelected: (item: PhotoItem) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        SearchScreen(searchQuery) { query ->
            updateSearchQuery(query)
        }
        LazyVerticalStaggeredGrid(
            columns = StaggeredGridCells.Fixed(2)
        ) {
            items(photoItems) { item ->
                PhotoScreen(item, photoItemSelected)
            }
        }
    }
}