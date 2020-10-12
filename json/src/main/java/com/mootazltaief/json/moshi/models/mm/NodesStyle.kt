package com.mootazltaief.json.moshi.models.mm


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NodesStyle(
    @Json(name = "backgroundColor")
    val backgroundColor: String,
    @Json(name = "borderColor")
    val borderColor: String,
    @Json(name = "borderStyle")
    val borderStyle: Int,
    @Json(name = "borderWidth")
    val borderWidth: Int,
    @Json(name = "font")
    val font: Any?,
    @Json(name = "fontColor")
    val fontColor: String,
    @Json(name = "fontSize")
    val fontSize: Int,
    @Json(name = "fontStyle")
    val fontStyle: Any?,
    @Json(name = "fontWeight")
    val fontWeight: String,
    @Json(name = "imageColor")
    val imageColor: String,
    @Json(name = "lineColor")
    val lineColor: String,
    @Json(name = "linePosition")
    val linePosition: Int,
    @Json(name = "lineStyle")
    val lineStyle: Any?,
    @Json(name = "lineType")
    val lineType: Int,
    @Json(name = "lineWidth")
    val lineWidth: Int,
    @Json(name = "shape")
    val shape: Int
)
