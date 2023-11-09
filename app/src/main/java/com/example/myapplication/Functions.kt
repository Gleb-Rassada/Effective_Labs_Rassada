package com.example.myapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ScreenShots() {
    // контейнер lazyrow
    LazyRow() {
        item {
            Image(
                painter = painterResource(id = R.drawable.gameplay1),
                contentDescription = "gamePlay1",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .background(Color.Transparent)
                    .height(120.dp)
                    .width(260.dp)
                    .padding(start = 24.dp, end = 24.dp)
                    .clip(RoundedCornerShape(10.dp)),
            )
        }
        item {
            Image(
                painter = painterResource(id = R.drawable.gameplay2),
                contentDescription = "gamePlay2",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .background(Color.Transparent)
                    .height(120.dp)
                    .width(260.dp)
                    .padding(start = 24.dp, end = 24.dp)
                    .clip(RoundedCornerShape(10.dp)),
                )
        }

        item {
            Image(
                painter = painterResource(id = R.drawable.gameplay3),
                contentDescription = "gamePlay3",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .background(Color.Transparent)
                    .height(120.dp)
                    .width(260.dp)
                    .padding(start = 24.dp, end = 24.dp)
                    .clip(RoundedCornerShape(10.dp)),
                )
        }
    }
}

@Composable
fun DotaHeader() {
    // контейнер image
    Image(
        painter = painterResource(id = R.drawable.jagger), // указываем ссылку на фотку
        contentDescription = "null",
        modifier = Modifier
            .height(300.dp)
            .fillMaxWidth(),
        contentScale = ContentScale.Crop
    )

}

@Composable
fun DotaInfo() {
    val myColor1: Color = Color(0xFF14314c /*сначала 0xFF потом HEX без'#' полученный из RGB на сайте*/)
    val myColor2: Color = Color(0xFF44a9f4)

    Row(
        modifier = Modifier.padding(
            start = 24.dp
        ), // с помощью модифаера настраиваем параметры контейнера
        horizontalArrangement = Arrangement.Start
        //contentAlignment = Alignment.TopStart

    ) {
        BlueOval("   MOBA   ", myColor1, myColor2)
        BlueOval("   MULTIPLAYER   ", myColor1, myColor2)
        BlueOval("   STRATEGY   ", myColor1, myColor2)
    }

    Column(
        modifier = Modifier.padding(
            start = 24.dp,
            end = 24.dp,
            top = 14.dp,
            bottom = 14.dp,
        )
    ) {
        Text(
            color = Color.White,
            text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own."
        )
    }
}

@Composable
fun BlueOval(genre: String, colorBack: Color, colorText: Color){
    Box(
        Modifier
            .height(20.dp)
            .padding(
                end = 5.dp
            )
            .clip(RoundedCornerShape(10.dp))
            .background(colorBack),
        contentAlignment = Alignment.Center
    ) {
        Text(color = colorText, fontSize = 7.sp, text = genre)
    }

}

@Composable
fun DotaLogo() { //val myColor: Color = Color(0xFF050B18)
    Row() {// иконка
        Box(
            modifier = Modifier
                .offset(
                    x = 20.dp,
                    y = -20.dp
                ) //порядок прописанных модификаторов имеет значение!
                .height(80.dp)
                .width(80.dp)
                .clip(RoundedCornerShape(10.dp))
                .border(BorderStroke(2.dp, Color.DarkGray), RoundedCornerShape(10.dp)),
            //расположение содержимого бокса
        ) {
            Image(
                painter = painterResource(id = R.drawable.dota_icon),
                contentDescription = "dota_icon",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .background(Color.Black)
                    .height(80.dp)
                    .width(80.dp)
                    .padding(15.dp)
            )
        }

        Text(color = Color.White, text = "DoTA 2", fontSize = 20.sp,
            modifier = Modifier.offset(x = 25.dp, y = 0.dp))

        Image(
            painter = painterResource(id = R.drawable.stars0), contentDescription = "star1",
            modifier = Modifier
                .height(45.dp)
                .width(90.dp)
                .offset(x = -55.dp, y = 20.dp)
                .padding(15.dp),
            contentScale = ContentScale.FillBounds
        )
    }
}

@Composable
fun ReviewAndRaiting()
{}
// Тут будут сейчас эксперименты

@Composable
private fun ListItem(name:String, prof: String){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),//закруглённые углы
        elevation = CardDefaults.cardElevation(5.dp)
    ){
        Box(){
            Row(verticalAlignment = Alignment.CenterVertically){
                Image(
                    painter = painterResource(id = R.drawable.face1),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column(modifier = Modifier.padding(start = 16.dp)){
                    Text(text = name)
                    Text(text = prof)
                    // подгони тут всё куда следует
                }
            }
        }
    }
}

