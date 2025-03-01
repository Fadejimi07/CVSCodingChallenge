package com.example.cvscodingchallenge.repository

import com.example.cvscodingchallenge.model.PhotoItem

interface PhotoRepository {
    suspend fun getPhotoList(tag: String): List<PhotoItem>
}