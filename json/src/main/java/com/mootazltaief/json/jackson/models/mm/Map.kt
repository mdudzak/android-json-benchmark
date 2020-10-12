package com.mootazltaief.json.jackson.models.mm
import com.fasterxml.jackson.annotation.JsonProperty

data class Map(
    @JsonProperty("createdAt")
    val createdAt: String,
    @JsonProperty("description")
    val description: Any?,
    @JsonProperty("id")
    val id: Int,
    @JsonProperty("permission")
    val permission: Int,
    @JsonProperty("revision")
    val revision: Int,
    @JsonProperty("shouldPoll")
    val shouldPoll: Boolean,
    @JsonProperty("title")
    val title: String,
    @JsonProperty("updatedAt")
    val updatedAt: String,
    @JsonProperty("url")
    val url: String,
    @JsonProperty("userId")
    val userId: Int
)
