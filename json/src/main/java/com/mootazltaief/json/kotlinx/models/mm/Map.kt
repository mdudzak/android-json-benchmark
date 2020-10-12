package com.mootazltaief.json.kotlinx.models.mm


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Map(
    @SerialName("createdAt")
    val createdAt: String,
    @SerialName("description")
    val description: String?,
    @SerialName("id")
    val id: Int,
    @SerialName("permission")
    val permission: Int,
    @SerialName("revision")
    val revision: Int,
    @SerialName("shouldPoll")
    val shouldPoll: Boolean,
    @SerialName("title")
    val title: String,
    @SerialName("updatedAt")
    val updatedAt: String,
    @SerialName("url")
    val url: String,
    @SerialName("userId")
    val userId: Int
)
