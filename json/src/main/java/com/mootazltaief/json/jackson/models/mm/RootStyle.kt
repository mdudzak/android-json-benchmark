package com.mootazltaief.json.jackson.models.mm
import com.fasterxml.jackson.annotation.JsonProperty

data class RootStyle(
    @JsonProperty("backgroundColor")
    val backgroundColor: String,
    @JsonProperty("borderColor")
    val borderColor: String,
    @JsonProperty("borderStyle")
    val borderStyle: Int,
    @JsonProperty("borderWidth")
    val borderWidth: Int,
    @JsonProperty("font")
    val font: Any?,
    @JsonProperty("fontColor")
    val fontColor: String,
    @JsonProperty("fontSize")
    val fontSize: Int,
    @JsonProperty("fontStyle")
    val fontStyle: Any?,
    @JsonProperty("fontWeight")
    val fontWeight: String,
    @JsonProperty("imageColor")
    val imageColor: String,
    @JsonProperty("lineColor")
    val lineColor: String,
    @JsonProperty("linePosition")
    val linePosition: Int,
    @JsonProperty("lineStyle")
    val lineStyle: Any?,
    @JsonProperty("lineType")
    val lineType: Int,
    @JsonProperty("lineWidth")
    val lineWidth: Int,
    @JsonProperty("shape")
    val shape: Int
)
