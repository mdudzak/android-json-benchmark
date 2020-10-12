package com.mootazltaief.json.moshi.models.mm


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Canvas(
    @Json(name = "scale")
    val scale: Double,
    @Json(name = "theme")
    val theme: Theme
)
