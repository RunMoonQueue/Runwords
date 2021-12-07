package com.moon.runwords.data

import java.io.Serializable

data class RuneWord(
    val id: Int,
    val title: String,
    val socket: String,
    val combinationRune: List<Int>,
    val options: String
) : Serializable
