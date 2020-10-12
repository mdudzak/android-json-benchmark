package com.mootazltaief.json.kotlinx.models.mm


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Background(
    @SerialName("color")
    val color: String,
    @SerialName("image")
    val image: String?,
    @SerialName("repeat")
    val repeat: Boolean
)
