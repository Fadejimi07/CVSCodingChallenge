package com.example.cvscodingchallenge.repository

import com.example.cvscodingchallenge.model.PhotoItem
import com.example.cvscodingchallenge.network.ApiService
import javax.inject.Inject

class PhotoRepositoryImpl @Inject constructor(private val apiService: ApiService) :
    PhotoRepository {
    override suspend fun getPhotoList(tag: String): List<PhotoItem> {
        return apiService.getPhotos(tag).photoItems
    }
}