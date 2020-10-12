package com.mootazltaief.json.kotlinx.models.mm


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RootStyle(
    @SerialName("backgroundColor")
    val backgroundColor: String,
    @SerialName("borderColor")
    val borderColor: String,
    @SerialName("borderStyle")
    val borderStyle: Int,
    @SerialName("borderWidth")
    val borderWidth: Int,
    @SerialName("font")
    val font: String?,
    @SerialName("fontColor")
    val fontColor: String,
    @SerialName("fontSize")
    val fontSize: Int,
    @SerialName("fontStyle")
    val fontStyle: String?,
    @SerialName("fontWeight")
    val fontWeight: String,
    @SerialName("imageColor")
    val imageColor: String,
    @SerialName("lineColor")
    val lineColor: String,
    @SerialName("linePosition")
    val linePosition: Int,
    @SerialName("lineStyle")
    val lineStyle: String?,
    @SerialName("lineType")
    val lineType: Int,
    @SerialName("lineWidth")
    val lineWidth: Int,
    @SerialName("shape")
    val shape: Int
)
