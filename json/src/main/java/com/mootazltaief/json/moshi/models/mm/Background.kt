package com.mootazltaief.json.moshi.models.mm


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Background(
    @Json(name = "color")
    val color: String,
    @Json(name = "image")
    val image: Any?,
    @Json(name = "repeat")
    val repeat: Boolean
)
