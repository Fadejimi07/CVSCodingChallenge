package com.example.cvscodingchallenge.network

import com.example.cvscodingchallenge.model.PhotoResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("feeds/photos_public.gne?format=json&nojsoncallback=1")
    fun getPhotos(
        @Query("tags")
        tag: String
    ): PhotoResponse
}