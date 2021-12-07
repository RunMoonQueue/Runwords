package com.moon.runwords

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moon.runwords.data.DataProvider
import com.moon.runwords.data.Rune
import com.moon.runwords.data.RuneWord

class RuneViewModel : ViewModel() {
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
}
