package com.moon.runwords

import android.app.Application
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.moon.runwords.data.DataProvider
import com.moon.runwords.data.RuneWord

@Composable
fun RuneScreen() {
    val runeViewModel: RuneViewModel =
        viewModel(factory = RuneViewModelFactory(LocalContext.current.applicationContext as Application))
    val runes = runeViewModel.runes.observeAsState()
    val runeWordList = runeViewModel.runeWordList.observeAsState()
    LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)) {
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Rune",
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier
                        .size(width = 100.dp, height = 40.dp)
                        .padding(vertical = 10.dp),
                    fontFamily = FontFamily(Font(R.font.light))
                )
                Text(
                    text = "  Initial  ", style = MaterialTheme.typography.h6,
                    modifier = Modifier
                        .size(width = 100.dp, height = 40.dp)
                        .padding(vertical = 10.dp)
                        .clickable {
                            runeViewModel.clearRune()
                        },
                    fontFamily = FontFamily(Font(R.font.light))
                )
            }
            FilterGrid(
                onClick = { rune ->
                    runeViewModel.toggleRune(rune)
                })

        }
        item {
            Text(text = "Rune Word", style = MaterialTheme.typography.h6, fontFamily = FontFamily(Font(R.font.light)))
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
