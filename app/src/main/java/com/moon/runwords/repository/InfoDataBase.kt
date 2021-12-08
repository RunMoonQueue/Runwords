package com.moon.runwords.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Info::class], version=1)
abstract class InfoDataBase: RoomDatabase() {
    abstract fun infoDao(): InfoDao?

    companion object {
        private val sLock = Any()
        private var instance: InfoDataBase? = null

        fun getInstance(context: Context): InfoDataBase {
            synchronized(sLock) {
                if (instance == null) {
                    instance = Room.databaseBuilder(context,
                        InfoDataBase::class.java, "info-db")
                        .allowMainThreadQueries() // FIXME : 일반적으로 mainThread 에서 사용하지 않음
                        .build()
                }
                return instance as InfoDataBase
            }
        }
    }
}
