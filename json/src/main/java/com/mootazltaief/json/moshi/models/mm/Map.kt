package com.mootazltaief.json.moshi.models.mm


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Map(
    @Json(name = "createdAt")
    val createdAt: String,
    @Json(name = "description")
    val description: Any?,
    @Json(name = "id")
    val id: Int,
    @Json(name = "permission")
    val permission: Int,
    @Json(name = "revision")
    val revision: Int,
    @Json(name = "shouldPoll")
    val shouldPoll: Boolean,
    @Json(name = "title")
    val title: String,
    @Json(name = "updatedAt")
    val updatedAt: String,
    @Json(name = "url")
    val url: String,
    @Json(name = "userId")
    val userId: Int
)
