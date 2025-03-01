package com.example.cvscodingchallenge.model

import com.google.gson.annotations.SerializedName

data class MediaItem(
    @SerializedName("m")
    val mediaUrl: String,
)
