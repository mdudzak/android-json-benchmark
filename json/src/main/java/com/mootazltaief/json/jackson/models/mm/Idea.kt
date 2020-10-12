package com.mootazltaief.json.jackson.models.mm

import com.fasterxml.jackson.annotation.JsonProperty

data class Idea(
    @JsonProperty("id")
    val id: Long = 0L,
    @JsonProperty("parentId")
    val parentId: Long? = null,
    @JsonProperty("title")
    val title: String = "",
    @JsonProperty("rank")
    val rank: Int? = 1,
    @JsonProperty("isCollapsed")
    val isCollapsed: Boolean = false,
    @JsonProperty("updatedAt")
    val updatedAt: String? = null,
    @JsonProperty("layout")
    val layout: Int? = null,
    @JsonProperty("backgroundColor")
    val backgroundColor: String? = null,
    @JsonProperty("borderColor")
    val borderColor: String? = null,
    @JsonProperty("borderWidth")
    val borderWidth: Int? = null,
    @JsonProperty("borderStyle")
    val borderStyle: Int? = null,
    @JsonProperty("font")
    val font: String? = null,
    @JsonProperty("fontColor")
    val fontColor: String? = null,
    @JsonProperty("fontSize")
    val fontSize: Int? = null,
    @JsonProperty("fontStyle")
    val fontStyle: String? = null,
    @JsonProperty("fontWeight")
    val fontWeight: String? = null,
    @JsonProperty("shape")
    val shape: Int? = null,
    @JsonProperty("boundaryFillOpacity")
    val boundaryFillOpacity: Double? = null,
    @JsonProperty("links")
    val links: List<String>? = listOf(),
    @JsonProperty("linePosition")
    val linePosition: Int? = null,
    @JsonProperty("lineWidth")
    val lineWidth: Int? = null,
    @JsonProperty("lineColor")
    val lineColor: String? = null,
    @JsonProperty("lineType")
    val lineType: Int? = null,
    @JsonProperty("lineStyle")
    val lineStyle: Int? = null,
    @JsonProperty("imageColor")
    val imageColor: String? = null,
    @JsonProperty("isBoundary")
    val isBoundary: Boolean = false,
    @JsonProperty("isFree")
    val isFree: Boolean = false,
    @JsonProperty("isFloating")
    val isFloating: Boolean = false,
    @JsonProperty("offsetX")
    val offsetX: Int = 0,
    @JsonProperty("offsetY")
    val offsetY: Int = 0,
    @JsonProperty("x")
    val x: Int? = null,
    @JsonProperty("y")
    val y: Int? = null,
    @JsonProperty("icon")
    val icon: String? = null,
    @JsonProperty("note")
    val note: String? = null,
    @JsonProperty("comments")
    val comments: List<String>? = emptyList(),
    @JsonProperty("attachments")
    val attachments: List<String>? = emptyList(),
    @JsonProperty("task")
    val task: String? = null,
    @JsonProperty("imageId")
    val imageId: Long? = null,
    @JsonProperty("imageUrl")
    val imageURL: String? = null,
    @JsonProperty("imageWidth")
    val imageWidth: Int? = null,
    @JsonProperty("imageHeight")
    val imageHeight: Int? = null,
    @JsonProperty("videoURL")
    val videoURL: String? = null,
    @JsonProperty("videoTitle")
    val videoTitle: String? = null
)
