package com.mootazltaief.json.moshi.models.mm

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoshiMap(
    @Json(name = "canvas")
    val canvas: Canvas,
    @Json(name = "connections")
    val connections: List<Any>,
    @Json(name = "ideas")
    val ideas: List<Idea>,
    @Json(name = "map")
    val map: Map
)
