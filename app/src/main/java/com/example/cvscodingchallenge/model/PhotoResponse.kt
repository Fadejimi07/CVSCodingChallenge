package com.example.cvscodingchallenge.model

import com.google.gson.annotations.SerializedName

data class PhotoResponse(
    val title: String,
    val link: String,
    val description: String,
    val modified: String,
    val generator: String,
    @SerializedName("items")
    val photoItems: List<PhotoItem>,
)