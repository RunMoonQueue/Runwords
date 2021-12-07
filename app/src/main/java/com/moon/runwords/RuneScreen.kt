package com.moon.runwords

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.moon.runwords.data.DataProvider
import com.moon.runwords.data.RuneWord


@Composable
fun RuneScreen() {
    val runeViewModel = viewModel<RuneViewModel>()
    val runes = runeViewModel.runes.observeAsState()
    val runeWordList = runeViewModel.runeWordList.observeAsState()
    LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)) {
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "룬 정보",
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier.size(width = 100.dp, height = 40.dp)
                )
                Text(
                    text = "  초기화  ", style = MaterialTheme.typography.h6,
                    modifier = Modifier.clickable {
                        runeViewModel.clearRune()
                    }
                )
            }
            FilterGrid(
                onClick = { rune ->
                    runeViewModel.toggleRune(rune)
                })

        }
        item {
            Text(text = "룬 워드", style = MaterialTheme.typography.h6)
        }
        runeWordList.value?.run {
            val runeWords = mutableListOf<RuneWord>()
            runeWords.addAll(DataProvider.runeWordList)
            forEach { runeWord ->
                var contain = false
                runes.value?.forEach { rune ->
                    if (runeWord.combinationRune.contains(rune.id)) {
                        contain = true
                    }
                }
                if (!contain) {
                    runeWords.remove(runeWord)
                }
            }
            items(items = runeWords.reversed(), itemContent = {
                RuneWordListItem(it)
            })
        }
    }
}
