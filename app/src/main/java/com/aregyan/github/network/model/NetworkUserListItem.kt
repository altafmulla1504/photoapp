package com.aregyan.github.network.model


import com.aregyan.github.database.DatabaseUserListItem
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NetworkUserListItem(
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

fun List<NetworkUserListItem>.asDatabaseModel(): List<DatabaseUserListItem> {
    return map {
        DatabaseUserListItem(
            id = it.id,
            title = it.title,
            url = it.url
        )
    }
}