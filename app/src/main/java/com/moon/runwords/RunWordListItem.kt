package com.moon.runwords

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.moon.runwords.data.DataProvider
import com.moon.runwords.data.RuneWord
import com.moon.runwords.ui.theme.combinationColor
import com.moon.runwords.ui.theme.optionColor
import com.moon.runwords.ui.theme.runeWordTitle

@Composable
fun RuneWordListItem(runeWord: RuneWord) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = runeWord.title, style = typography.h6, color= runeWordTitle)
                Text(text = runeWord.socket, style = typography.h6)
                CombinationRune(runeWord = runeWord)
                Text(
                    text = runeWord.options,
                    style = typography.caption,
                    modifier = Modifier
                        .padding(horizontal = 4.dp),
                    textAlign = TextAlign.Center,
                    color = optionColor
                )
            }
        }
    }
}

@Composable
private fun CombinationRune(runeWord: RuneWord) {
    LazyRow(contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp)) {
        items(items = runeWord.combinationRune, itemContent = {
            CombinationListItem(it)
        })
    }
}

@Composable
private fun CombinationListItem(rune: Int) {
    Text(
        text = DataProvider.runList[rune - 1].title + " (" + rune.toString() + ")",
        style = typography.caption,
        modifier = Modifier.padding(horizontal = 4.dp),
        color = combinationColor
    )
}
