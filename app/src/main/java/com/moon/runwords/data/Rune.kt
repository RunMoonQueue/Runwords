package com.moon.runwords.data

import java.io.Serializable

data class Rune(
    val id: Int,
    val title: String,
    val runeImageId: Int = 0
) : Serializable