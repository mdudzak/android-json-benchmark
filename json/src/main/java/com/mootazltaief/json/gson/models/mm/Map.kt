package com.mootazltaief.json.gson.models.mm


import com.google.gson.annotations.SerializedName

data class Map(
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("description")
    val description: Any?,
    @SerializedName("id")
    val id: Int,
    @SerializedName("permission")
    val permission: Int,
    @SerializedName("revision")
    val revision: Int,
    @SerializedName("shouldPoll")
    val shouldPoll: Boolean,
    @SerializedName("title")
    val title: String,
    @SerializedName("updatedAt")
    val updatedAt: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("userId")
    val userId: Int
)
