package com.mootazltaief.json.gson.models.mm

import com.google.gson.annotations.SerializedName

data class Background(
    @SerializedName("color")
    val color: String,
    @SerializedName("image")
    val image: Any?,
    @SerializedName("repeat")
    val repeat: Boolean
)
