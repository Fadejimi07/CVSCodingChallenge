package com.example.cvscodingchallenge.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.cvscodingchallenge.viewmodel.PhotoViewModel

@Composable
fun HomeScreen(modifier: Modifier) {
    val viewModel: PhotoViewModel = hiltViewModel()
    var searchQuery by rememberSaveable { mutableStateOf("") }
    viewModel.getPhotos(searchQuery)
    val photoItems = viewModel.photoItems
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        SearchScreen(searchQuery) { query ->
            searchQuery = query
        }
        LazyVerticalStaggeredGrid(
            columns = StaggeredGridCells.Fixed(2)
        ) {
            items(photoItems) { item ->
                PhotoScreen(item)
            }
        }
    }
}