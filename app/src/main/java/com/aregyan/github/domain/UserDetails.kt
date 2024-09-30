package com.aregyan.github.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserDetails(
    val albumId:Int = 0,
    val id:Int= 0,
    val title:String = "",
    val url: String="",
    val thumbnailUrl:String="",
) : Parcelable