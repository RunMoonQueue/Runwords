package com.moon.runwords.repository

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface InfoDao {
    @Query("SELECT * from info")
    fun getAll(): LiveData<MutableList<Info>>

    @Insert
    fun insert(info: Info)

    @Query("DELETE FROM info WHERE runeWordId=:id")
    fun deleteByRuneWordId(id: Int)

    @Query("SELECT * from info WHERE runeWordId =:id")
    fun findByRuneWordId(id: Int): LiveData<Info?>
}
