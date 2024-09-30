package com.aregyan.github.network.model


import com.aregyan.github.database.DatabaseUserDetails
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NetworkUserDetails(
    @Json(name = "albumId")
    val albumId: Int,
    @Json(name = "id")
    val id: Int,
    @Json(name = "title")
    val title: String,
    @Json(name = "url")
    val url: String,
    @Json(name = "thumbnailUrl")
    val thumbnailUrl: String? = null,

)

fun NetworkUserDetails.asDatabaseModel(): DatabaseUserDetails {
    return DatabaseUserDetails(
        albumId = albumId,
        id = id,
        title = title,
        url = url ?: "",
        thumbnailUrl = thumbnailUrl ?: ""
    )

}