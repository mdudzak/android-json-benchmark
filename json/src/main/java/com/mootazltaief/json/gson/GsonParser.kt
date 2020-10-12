package com.mootazltaief.json.gson

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.mootazltaief.json.Utils
import com.mootazltaief.json.gson.models.PhotosGson
import com.mootazltaief.json.gson.models.UserGson
import com.mootazltaief.json.gson.models.mm.GsonMap

class GsonParser(context: Context) {

    private var gson = Gson()

    private val sample1 = Utils.loadJSONFromAsset(context, "sample1.json")
    private val sample2 = Utils.loadJSONFromAsset(context, "sample2.json")
    private val sample3 = Utils.loadJSONFromAsset(context, "sample3.json")
    private val sampleMm4 = Utils.loadJSONFromAsset(context, "mm.json")

    private val userTypeToken = object : TypeToken<List<UserGson>>() {}.type

    fun parseSample1(): List<UserGson> {
        return gson.fromJson(sample1, userTypeToken)
    }

    fun parseSample2(): List<UserGson> {
        return gson.fromJson(sample2, userTypeToken)
    }

    fun parseSample3(): PhotosGson {
        return gson.fromJson(sample3, PhotosGson::class.java)
    }

    fun parseSample4(): GsonMap {
        return gson.fromJson(sampleMm4, GsonMap::class.java)
    }
}
