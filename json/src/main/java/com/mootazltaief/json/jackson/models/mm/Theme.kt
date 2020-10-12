package com.mootazltaief.json.jackson.models.mm
import com.fasterxml.jackson.annotation.JsonProperty

data class Theme(
    @JsonProperty("background")
    val background: Background,
    @JsonProperty("colors")
    val colors: List<String>,
    @JsonProperty("hasSmartBackgroundColors")
    val hasSmartBackgroundColors: Boolean,
    @JsonProperty("hasSmartLineColors")
    val hasSmartLineColors: Boolean,
    @JsonProperty("id")
    val id: Int,
    @JsonProperty("isDefault")
    val isDefault: Boolean,
    @JsonProperty("isTemplate")
    val isTemplate: Boolean,
    @JsonProperty("name")
    val name: String,
    @JsonProperty("nodesSelectedColor")
    val nodesSelectedColor: String,
    @JsonProperty("nodesStyle")
    val nodesStyle: NodesStyle,
    @JsonProperty("rootChildrenSelectedColor")
    val rootChildrenSelectedColor: String,
    @JsonProperty("rootChildrenStyle")
    val rootChildrenStyle: RootChildrenStyle,
    @JsonProperty("rootSelectedColor")
    val rootSelectedColor: String,
    @JsonProperty("rootStyle")
    val rootStyle: RootStyle,
    @JsonProperty("smartColors")
    val smartColors: List<Any>,
    @JsonProperty("teamId")
    val teamId: Any?,
    @JsonProperty("thumbnail")
    val thumbnail: String
)
