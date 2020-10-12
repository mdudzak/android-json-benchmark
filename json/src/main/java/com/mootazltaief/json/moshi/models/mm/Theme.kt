package com.mootazltaief.json.moshi.models.mm


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Theme(
    @Json(name = "background")
    val background: Background,
    @Json(name = "colors")
    val colors: List<String>,
    @Json(name = "hasSmartBackgroundColors")
    val hasSmartBackgroundColors: Boolean,
    @Json(name = "hasSmartLineColors")
    val hasSmartLineColors: Boolean,
    @Json(name = "id")
    val id: Int,
    @Json(name = "isDefault")
    val isDefault: Boolean,
    @Json(name = "isTemplate")
    val isTemplate: Boolean,
    @Json(name = "name")
    val name: String,
    @Json(name = "nodesSelectedColor")
    val nodesSelectedColor: String,
    @Json(name = "nodesStyle")
    val nodesStyle: NodesStyle,
    @Json(name = "rootChildrenSelectedColor")
    val rootChildrenSelectedColor: String,
    @Json(name = "rootChildrenStyle")
    val rootChildrenStyle: RootChildrenStyle,
    @Json(name = "rootSelectedColor")
    val rootSelectedColor: String,
    @Json(name = "rootStyle")
    val rootStyle: RootStyle,
    @Json(name = "smartColors")
    val smartColors: List<Any>,
    @Json(name = "teamId")
    val teamId: Any?,
    @Json(name = "thumbnail")
    val thumbnail: String
)
