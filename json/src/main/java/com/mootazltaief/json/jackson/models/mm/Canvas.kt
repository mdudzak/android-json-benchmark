package com.mootazltaief.json.jackson.models.mm
import com.fasterxml.jackson.annotation.JsonProperty

data class Canvas(
    @JsonProperty("scale")
    val scale: Double,
    @JsonProperty("theme")
    val theme: Theme
)
