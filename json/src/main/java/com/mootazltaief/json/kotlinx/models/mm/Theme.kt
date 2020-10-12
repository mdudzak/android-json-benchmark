package com.mootazltaief.json.kotlinx.models.mm


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Theme(
    @SerialName("background")
    val background: Background,
    @SerialName("colors")
    val colors: List<String>,
    @SerialName("hasSmartBackgroundColors")
    val hasSmartBackgroundColors: Boolean,
    @SerialName("hasSmartLineColors")
    val hasSmartLineColors: Boolean,
    @SerialName("id")
    val id: Int,
    @SerialName("isDefault")
    val isDefault: Boolean,
    @SerialName("isTemplate")
    val isTemplate: Boolean,
    @SerialName("name")
    val name: String,
    @SerialName("nodesSelectedColor")
    val nodesSelectedColor: String,
    @SerialName("nodesStyle")
    val nodesStyle: NodesStyle,
    @SerialName("rootChildrenSelectedColor")
    val rootChildrenSelectedColor: String,
    @SerialName("rootChildrenStyle")
    val rootChildrenStyle: RootChildrenStyle,
    @SerialName("rootSelectedColor")
    val rootSelectedColor: String,
    @SerialName("rootStyle")
    val rootStyle: RootStyle,
    @SerialName("smartColors")
    val smartColors: List<String>,
    @SerialName("teamId")
    val teamId: Long?,
    @SerialName("thumbnail")
    val thumbnail: String
)
