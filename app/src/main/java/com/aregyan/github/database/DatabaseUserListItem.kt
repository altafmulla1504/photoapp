package com.aregyan.github.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.aregyan.github.domain.UserListItem

@Entity
data class DatabaseUserListItem(
    @PrimaryKey
    val id: Int,
    val title: String,
    val url: String
)

fun List<DatabaseUserListItem>.asDomainModel(): List<UserListItem> {
    return map {
        UserListItem(
            id = it.id,
            title = it.title,
            url = it.url
        )
    }
}