package com.mootazltaief.json.gson.models.mm


import com.google.gson.annotations.SerializedName

data class Theme(
    @SerializedName("background")
    val background: Background,
    @SerializedName("colors")
    val colors: List<String>,
    @SerializedName("hasSmartBackgroundColors")
    val hasSmartBackgroundColors: Boolean,
    @SerializedName("hasSmartLineColors")
    val hasSmartLineColors: Boolean,
    @SerializedName("id")
    val id: Int,
    @SerializedName("isDefault")
    val isDefault: Boolean,
    @SerializedName("isTemplate")
    val isTemplate: Boolean,
    @SerializedName("name")
    val name: String,
    @SerializedName("nodesSelectedColor")
    val nodesSelectedColor: String,
    @SerializedName("nodesStyle")
    val nodesStyle: NodesStyle,
    @SerializedName("rootChildrenSelectedColor")
    val rootChildrenSelectedColor: String,
    @SerializedName("rootChildrenStyle")
    val rootChildrenStyle: RootChildrenStyle,
    @SerializedName("rootSelectedColor")
    val rootSelectedColor: String,
    @SerializedName("rootStyle")
    val rootStyle: RootStyle,
    @SerializedName("smartColors")
    val smartColors: List<Any>,
    @SerializedName("teamId")
    val teamId: Any?,
    @SerializedName("thumbnail")
    val thumbnail: String
)
