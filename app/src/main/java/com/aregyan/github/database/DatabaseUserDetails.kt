package com.aregyan.github.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.aregyan.github.domain.UserDetails

@Entity
data class DatabaseUserDetails(
    @PrimaryKey
    val albumId: Int,
    val id:Int,
    val title:String,
    val url: String,
    val thumbnailUrl:String,
)

fun DatabaseUserDetails.asDomainModel(): UserDetails {
    return UserDetails(
        albumId = albumId,
        id = id,
        title = title,
        url = url,
        thumbnailUrl = thumbnailUrl
    )
}