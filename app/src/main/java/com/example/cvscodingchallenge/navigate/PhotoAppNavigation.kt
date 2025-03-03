package com.example.cvscodingchallenge.navigate

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cvscodingchallenge.R
import com.example.cvscodingchallenge.screens.HomeScreen
import com.example.cvscodingchallenge.screens.PhotoDetailScreen
import com.example.cvscodingchallenge.viewmodel.PhotoViewModel

enum class PhotoAppScreen(@StringRes val titleRes: Int) {
    PhotoListScreen(titleRes = R.string.photo_list_title),
    DetailsScreen(titleRes = R.string.photo_detail_title)
}

@Composable
fun PhotoAppNavigation(
    viewModel: PhotoViewModel = hiltViewModel(),
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
) {
    var searchQuery by rememberSaveable {
        mutableStateOf("")
    }

    NavHost(
        navController = navController,
        startDestination = PhotoAppScreen.PhotoListScreen.name,
        modifier = modifier
    ) {
        composable(route = PhotoAppScreen.PhotoListScreen.name) {
            HomeScreen(
                photoItems = viewModel.photoItems,
                searchQuery = searchQuery,
                updateSearchQuery = { query: String ->
                    viewModel.getPhotos(query)
                    searchQuery = query
                },
                photoItemSelected = { photoItem ->
                    viewModel.setSelectedItem(photoItem)
                }
            )
        }

        composable(route = PhotoAppScreen.DetailsScreen.name) {
            PhotoDetailScreen(
                photoItem = viewModel.selectedItem
            )
        }
    }
}