package com.example.cvscodingchallenge.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cvscodingchallenge.model.PhotoItem
import com.example.cvscodingchallenge.repository.PhotoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PhotoViewModel @Inject constructor(private val photoRepository: PhotoRepository) :
    ViewModel() {
    var photoItems by mutableStateOf<List<PhotoItem>>(emptyList())
        private set

    fun getPhotos(tag: String) {
        viewModelScope.launch(Dispatchers.IO) {
            photoItems = photoRepository.getPhotoList(tag)
        }
    }
}