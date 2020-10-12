package com.mootazltaief.json.gson.models.mm


import com.google.gson.annotations.SerializedName

data class NodesStyle(
    @SerializedName("backgroundColor")
    val backgroundColor: String,
    @SerializedName("borderColor")
    val borderColor: String,
    @SerializedName("borderStyle")
    val borderStyle: Int,
    @SerializedName("borderWidth")
    val borderWidth: Int,
    @SerializedName("font")
    val font: Any?,
    @SerializedName("fontColor")
    val fontColor: String,
    @SerializedName("fontSize")
    val fontSize: Int,
    @SerializedName("fontStyle")
    val fontStyle: Any?,
    @SerializedName("fontWeight")
    val fontWeight: String,
    @SerializedName("imageColor")
    val imageColor: String,
    @SerializedName("lineColor")
    val lineColor: String,
    @SerializedName("linePosition")
    val linePosition: Int,
    @SerializedName("lineStyle")
    val lineStyle: Any?,
    @SerializedName("lineType")
    val lineType: Int,
    @SerializedName("lineWidth")
    val lineWidth: Int,
    @SerializedName("shape")
    val shape: Int
)
