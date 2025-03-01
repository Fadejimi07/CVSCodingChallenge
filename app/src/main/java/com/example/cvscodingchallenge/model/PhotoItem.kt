package com.example.cvscodingchallenge.model

import com.google.gson.annotations.SerializedName

data class PhotoItem(
    val title: String,
    val link: String,
    val media: MediaItem,
    @SerializedName("date_taken")
    val dateTaken: String,
    val description: String,
    val published: String,
    val author: String,
    val authorId: String,
    val tags: String,
)