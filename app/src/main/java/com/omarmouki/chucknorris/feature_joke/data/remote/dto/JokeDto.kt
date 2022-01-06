package com.omarmouki.chucknorris.feature_joke.data.remote.dto


import com.google.gson.annotations.SerializedName

data class JokeDto(
    @SerializedName("icon_url")
    val iconUrl: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("value")
    val value: String
)