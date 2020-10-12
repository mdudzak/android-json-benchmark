package com.mootazltaief.json.jackson.models.mm
import com.fasterxml.jackson.annotation.JsonProperty

data class Background(
    @JsonProperty("color")
    val color: String,
    @JsonProperty("image")
    val image: Any?,
    @JsonProperty("repeat")
    val repeat: Boolean
)
