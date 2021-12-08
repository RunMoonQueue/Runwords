package com.moon.runwords

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InfoScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = "룬워드는 나무위키에서 제공하는 데이터로 정보를 표시합니다. \n" +
                    "디아블로2 초보 유저가 룬워드 계산기가 필요하여 제작하게 되었습니다. \n" +
                    "\n" +
                    "\n" +
                    "이제 탈셋 맞춘 초보 디아 유저입니다. \n" +
                    "카오스큐브(뿡뿡이네)로 CP 기부 받습니다. \n" +
                    "\n" +
                    "추가 문의사항 혹은 기능 관련하여 아래의 링크로 문의 부탁드립니다.\n", style = MaterialTheme.typography.h6
        )
        val annotatedString = buildAnnotatedString {
            val str = "FAQ > link"
            val endIndex = str.length
            append(str)
            addStyle(
                style = SpanStyle(
                    color = Color.White,
                    fontSize = 18.sp,
                    textDecoration = TextDecoration.Underline
                ), start = 0, end = endIndex
            )

            // attach a string annotation that stores a URL to the text "link"
            addStringAnnotation(
                tag = "URL",
                annotation = "https://moonque.tistory.com/entry/%EB%A3%AC%EC%9B%8C%EB%93%9C-%EA%B3%84%EC%82%B0%EA%B8%B0",
                start = 0,
                end = endIndex
            )
        }
        val uriHandler = LocalUriHandler.current
        ClickableText(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            text = annotatedString,
            style = MaterialTheme.typography.h6,
            onClick = {
                annotatedString
                    .getStringAnnotations("URL", it, it)
                    .firstOrNull()?.let { stringAnnotation ->
                        uriHandler.openUri(stringAnnotation.item)
                    }
            }
        )
    }
}
