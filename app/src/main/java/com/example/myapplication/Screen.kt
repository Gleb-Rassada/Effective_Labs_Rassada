package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Screen() {
    val myColor: Color = Color(0xFF050B18)

    Column(
        modifier = Modifier
            .background(myColor)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {

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
            item {
                ReviewAndRatings()
            }

            item {
                Commentaries(
                    name = "Pudge",
                    date = "October.04.2023",
                    comment = "Я провёл больше 3000 часов в Dota 2 и не вижу в этом ничего плохого.",
                    photo = R.drawable.face1
                )
            }
            item {
                Commentaries(
                    name = "Treant Protector",
                    date = "July.11.2023",
                    comment = "Эта игра покорила сердца миллионов игроков. Будучи когда-то обычной картой к великому Warcraft 3, она переросла в собственный лейбл, обожаемый миллионами игроков во всем мире.",
                    photo = R.drawable.face2
                )
            }
            item {
                Commentaries(
                    name = "Phoenix",
                    date = "April.21.2023",
                    comment = "9 умственно отсталых и вас заперли в рамках одного матча на час. Через пол часа оказывается, что умственно отсталых 10 .",
                    photo = R.drawable.face3
                )
            }

            item {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(bottom = 30.dp),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Button()
                }
            }


        }
    }

}