package com.example.practicepractice

import java.io.Serializable

data class SoccerTile(
    val id: String = "",
    val title: String = "",
    val description: String = "",
    val descriptionLong: String = "",
    val buttonText: String = "",
    val headerImageResId: Int = 0,
    val headerImageUrl: String = "",
):Serializable
