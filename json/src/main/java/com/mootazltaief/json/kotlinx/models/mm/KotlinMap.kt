package com.mootazltaief.json.kotlinx.models.mm


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class KotlinMap(
    @SerialName("canvas")
    val canvas: Canvas,
    @SerialName("connections")
    val connections: List<String>?,
    @SerialName("ideas")
    val ideas: List<Idea>,
    @SerialName("map")
    val map: Map
)
