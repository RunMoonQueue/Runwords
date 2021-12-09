package com.moon.runwords

import android.app.Application
import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.moon.runwords.data.DataProvider
import com.moon.runwords.repository.Info

@Composable
fun FavoriteScreen() {
    val runeViewModel: RuneViewModel =
        viewModel(factory = RuneViewModelFactory(LocalContext.current.applicationContext as Application))
    val list: List<Info>? = runeViewModel.dbRuneWords?.observeAsState()?.value
    Log.i("MQ!", "FavoriteScreen : $list")
    Column {
        AndroidView(modifier = Modifier.fillMaxWidth(), factory = { context ->
            AdView(context).apply {
                adSize = AdSize.BANNER
                adUnitId = "ca-app-pub-8549606613390169/8580422973"
                // TEST
//                adUnitId = "ca-app-pub-3940256099942544/6300978111"
                loadAd(AdRequest.Builder().build())
            }
        })
        if (list != null) {
            if (list.isEmpty()) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(
                        text = "추가된 룬워드가 없습니다",
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        textAlign = TextAlign.Center,
                        fontSize = 25.sp
                    )
                }
            } else {
                LazyColumn(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                    items(items = list, itemContent = { index ->
                        val runeWord = DataProvider.runeWordList.find {
                            it.id == index.runeWordId
                        }
                        runeWord?.run {
                            RuneWordListItem(runeWord = this)
                        }
                    })
                }
            }
        }
    }


}
