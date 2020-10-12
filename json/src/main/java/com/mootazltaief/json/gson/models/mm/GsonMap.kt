package com.mootazltaief.json.gson.models.mm


import com.google.gson.annotations.SerializedName

data class GsonMap(
    @SerializedName("canvas")
    val canvas: Canvas,
    @SerializedName("connections")
    val connections: List<Any>,
    @SerializedName("ideas")
    val ideas: List<Idea>,
    @SerializedName("map")
    val map: Map
)
