package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun Screen(){
    val myColor: Color = Color(0xFF050B18)

    Column (modifier = Modifier
        .background(myColor)
        .fillMaxWidth()
        .fillMaxHeight()){

        LazyColumn(
            modifier = Modifier
                .fillMaxSize(),
        ) {

            item {
                DotaHeader()
            }

            item {
                DotaLogo()
                //тут логотип, надпись DoTA и звёздочки
            }

            item {
                DotaInfo()
                // тут жанры игры в голубых блоках и описание игры
            }

            item {
                ScreenShots()
            }
//            item {ListItem("a","b")}
//          item {
//              ReviewAndRaiting()
//          } // сюда рейтинг и обзоры

        }
    }

}