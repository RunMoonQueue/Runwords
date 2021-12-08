package com.moon.runwords.repository

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Info(
    val runeWordId: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}