package com.moon.runwords

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.moon.runwords.data.DataProvider
import com.moon.runwords.data.Rune

@Composable
fun FilterGrid(onClick: (index: Rune) -> Unit = {}) {
    val scrollState = rememberScrollState()
    val runeViewModel = viewModel<RuneViewModel>()
    val runeList = runeViewModel.runes.observeAsState()

    Column(modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)) {
        var index = 0
        repeat(3) {
            Row(modifier = Modifier.horizontalScroll(scrollState)) {
                repeat(11) {
                    val rune = DataProvider.runList[index++]
                    RuneItem(rune = rune, runeList.value?.contains(rune) ?: false, onClick)
                }
            }
        }
    }
}

@Composable
fun RuneItem(rune: Rune, isSelected: Boolean, onClick: (index: Rune) -> Unit = {}) {
    Column(
        modifier = Modifier
            .padding(vertical =5.dp, horizontal = 0.dp)
            .size(width = 70.dp, height = 80.dp)
            .clickable {
                onClick(rune)
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = rune.runeImageId), contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(60.dp)
                .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
                .alpha(if (isSelected) 0.5F else 1F)
        )
        Text(text = rune.title +" (" + rune.id+")", style = typography.caption)
    }
}
