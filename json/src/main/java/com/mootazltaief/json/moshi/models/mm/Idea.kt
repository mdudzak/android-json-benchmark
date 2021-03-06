package com.mootazltaief.json.moshi.models.mm

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Idea(
    val id: Long = 0L,
    val parentId: Long? = null,
    val title: String = "",
    val rank: Int? = 1,
    val isCollapsed: Boolean = false,
    val updatedAt: String? = null,
    val layout: Int? = null,
    val backgroundColor: String? = null,
    val borderColor: String? = null,
    val borderWidth: Int? = null,
    val borderStyle: Int? = null,
    val font: String? = null,
    val fontColor: String? = null,
    val fontSize: Int? = null,
    val fontStyle: String? = null,
    val fontWeight: String? = null,
    val shape: Int? = null,
    val boundaryFillOpacity: Double? = null,
    val linePosition: Int? = null,
    val lineWidth: Int? = null,
    val lineColor: String? = null,
    val lineType: Int? = null,
    val lineStyle: Int? = null,
    val imageColor: String? = null,
    val isBoundary: Boolean = false,
    val isFree: Boolean = false,
    val isFloating: Boolean = false,
    val offsetX: Int = 0,
    val offsetY: Int = 0,
    val x: Int? = null,
    val y: Int? = null,
    val icon: String? = null,
    val note: String? = null,
    val comments: List<String>? = emptyList(),
    val attachments: List<String>? = emptyList(),
    val task: String? = null,
    val imageId: Long? = null,
    val imageURL: String? = null,
    val imageWidth: Int? = null,
    val imageHeight: Int? = null,
    val videoURL: String? = null,
    val videoTitle: String? = null
)
