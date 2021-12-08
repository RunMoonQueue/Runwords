package com.moon.runwords

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.moon.runwords.data.DataProvider
import com.moon.runwords.data.RuneWord
import com.moon.runwords.ui.theme.combinationColor
import com.moon.runwords.ui.theme.optionColor
import com.moon.runwords.ui.theme.runeWordTitle

@Composable
fun RuneWordListItem(runeWord: RuneWord) {
    val context = LocalContext.current
    val runeViewModel: RuneViewModel = viewModel(factory = RuneViewModelFactory(LocalContext.current.applicationContext as Application))
    val isFavorite = runeViewModel.isFavorite(runeWord.id).observeAsState()
    Log.i("MQ!", "runeWord title:${runeWord.title} + id: ${runeWord.id}, isFavorite:$isFavorite")
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
                Row {
                    Text(text = runeWord.title, style = typography.h6, color = runeWordTitle)
                    Image(
                        painter = painterResource(id = if (isFavorite.value == true) R.drawable.ic_favorite else R.drawable.ic_unfavorite),
                        contentDescription = null,
                        modifier = Modifier
                            .size(32.dp)
                            .padding(horizontal = 8.dp)
                            .align(Alignment.CenterVertically)
                            .clickable(onClick = {
                                val message = if (isFavorite.value == true) "삭제 되었습니다." else "추가 되었습니다."
                                Toast
                                    .makeText(context, message, Toast.LENGTH_SHORT)
                                    .show()
                                if (isFavorite.value == true) {
                                    runeViewModel.deleteByRuneWordId(runeWord.id)
                                } else {
                                    runeViewModel.insertRuneWord(runeWord.id)
                                }
                            })
                    )
                }

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
