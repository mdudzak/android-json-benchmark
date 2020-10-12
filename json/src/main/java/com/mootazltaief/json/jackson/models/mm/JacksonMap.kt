package com.mootazltaief.json.jackson.models.mm
import com.fasterxml.jackson.annotation.JsonProperty

data class JacksonMap(
    @JsonProperty("canvas")
    val canvas: Canvas,
    @JsonProperty("connections")
    val connections: List<Any>,
    @JsonProperty("ideas")
    val ideas: List<Idea>,
    @JsonProperty("map")
    val map: Map
)
