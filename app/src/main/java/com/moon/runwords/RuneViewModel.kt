package com.moon.runwords

import android.app.Application
import androidx.lifecycle.*
import com.moon.runwords.data.DataProvider
import com.moon.runwords.data.Rune
import com.moon.runwords.data.RuneWord
import com.moon.runwords.repository.Info
import com.moon.runwords.repository.InfoDataBase

class RuneViewModel(application: Application) : ViewModel() {
    val runes = MutableLiveData<MutableSet<Rune>>().apply {
        postValue(mutableSetOf())
    }

    fun toggleRune(index: Rune) {
        val list = mutableSetOf<Rune>()
        runes.value?.let { list.addAll(it) }

        if (list.contains(index)) {
            list.remove(index)
        } else {
            list.add(index)
        }
        runes.value = list
    }

    fun clearRune() {
        runes.postValue(null)
    }

    var runeWordList = MutableLiveData<MutableList<RuneWord>>().apply {
        val list = mutableListOf<RuneWord>()
        list.addAll(DataProvider.runeWordList)
        postValue(list)
    }

    private val db: InfoDataBase = InfoDataBase.getInstance(application)

    internal val dbRuneWords: LiveData<MutableList<Info>>? = db.infoDao()?.getAll()

    fun insertRuneWord(id: Int) {
        db?.infoDao()?.insert(Info(id))
    }

    fun deleteByRuneWordId(id: Int) {
        db?.infoDao()?.deleteByRuneWordId(id)
    }

    fun isFavorite(id: Int) = Transformations.map(db?.infoDao()?.findByRuneWordId(id) as LiveData<Info>) { it != null }
}

class RuneViewModelFactory(
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RuneViewModel::class.java)) {
            return RuneViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
