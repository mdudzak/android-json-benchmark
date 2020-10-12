package com.mootazltaief.json.kotlinx.models.mm


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Canvas(
    @SerialName("scale")
    val scale: Double,
    @SerialName("theme")
    val theme: Theme
)
