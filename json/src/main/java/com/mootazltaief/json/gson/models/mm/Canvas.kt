package com.mootazltaief.json.gson.models.mm


import com.google.gson.annotations.SerializedName

data class Canvas(
    @SerializedName("scale")
    val scale: Double,
    @SerializedName("theme")
    val theme: Theme
)
