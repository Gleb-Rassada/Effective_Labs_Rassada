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
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.myapplication.ui.theme.MyYellow


@Composable
fun ScreenShots() {
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
    val myColor1: Color =
        Color(0xFF14314c /*сначала 0xFF потом HEX без'#' полученный из RGB на сайте*/)
    val myColor2: Color = Color(0xFF44a9f4)

    Row(
        modifier = Modifier.padding(
            start = 24.dp
        ), // с помощью модифаера настраиваем параметры контейнера
        horizontalArrangement = Arrangement.Start

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
fun BlueOval(genre: String, colorBack: Color, colorText: Color) {
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
fun DotaLogo() {
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
        Column() {
            Text(
                color = Color.White, text = "DoTA 2", fontSize = 20.sp,
                modifier = Modifier.offset(x = 27.dp, y = 10.dp)
            )

            Row(modifier = Modifier.offset(25.dp, 15.dp)) {
                FiveStars()
                Text(color = Color.Gray, text = "  70M", fontSize = 13.sp)

            }

        }

    }
}

@Composable
fun oneStar() {
    Image(
        painter = painterResource(R.drawable.star),
        contentDescription = "dotaScreenshot",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .background(Color.Transparent)
            .height(15.dp)
            .width(15.dp)

    )
}

@Composable
fun FiveStars() {
    Row(
        modifier = Modifier,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        oneStar()
        oneStar()
        oneStar()
        oneStar()
        oneStar()
    }
}

@Composable
fun ReviewAndRatings() {

    Column(modifier = Modifier.padding(24.dp)) {
        Text(
            color = Color.White,
            text = "Review & Ratings",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
        )
        Row() {
            Box() {
                Text(
                    color = Color.White,
                    text = "4.9",
                    fontWeight = FontWeight.Bold,
                    fontSize = 49.sp,
                )
            }

            Box() {
                Box(
                    modifier = Modifier
                        .zIndex(2f)
                        .offset(25.dp, 35.dp)
                ) {
                    Text(
                        color = Color.Gray,
                        text = "70M" + " Reviews",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                    )
                }

                Box(
                    modifier = Modifier
                        .zIndex(2f)
                        .offset(23.dp, 18.dp)
                )
                {
                    FiveStars()
                }
            }
        }
    }
}

@Composable
fun Commentaries(name: String, date: String, comment: String, photo: Int) {
    Card(
        modifier = Modifier
            .background(Color.Transparent)
            .fillMaxWidth()
            .padding(top = 10.dp)
    ) {
        val BackGroundColor: Color = Color(0xFF050B18)
        Box(
            modifier = Modifier.background(BackGroundColor)
        ) {
            Column(modifier = Modifier.padding(start = 24.dp, end = 24.dp)) {
                Row {
                    Image(
                        painter = painterResource(id = photo),
                        contentDescription = "null",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(64.dp)
                            .clip(CircleShape)
                    )
                    Column(modifier = Modifier.padding(horizontal = 20.dp)) {
                        Box() {
                            Text(
                                text = name,
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                        }
                        Box(modifier = Modifier.padding(top = 10.dp)) {
                            Text(text = date, color = Color.Gray)
                        }

                    }
                }
                Box(modifier = Modifier.padding(top = 20.dp)) {
                    Text(
                        text = "\"" + comment + "\"",
                        color = Color.White,
                        modifier = Modifier.padding(vertical = 3.dp)
                    )

                }
                Box(
                    modifier = Modifier
                        .padding(horizontal = 20.dp, vertical = 20.dp)
                        .alpha(0.25f)
                ) {
                    Divider(color = Color.Gray, thickness = 1.dp)
                }
            }
        }
    }
}

@Composable
fun Footer(pad: Int) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(pad.dp)
    ) { }
}
@Composable
fun Button(){
    TextButton(
        onClick ={},
        modifier = Modifier
            .padding(start =30.dp, end = 30.dp, top = 20.dp )
            .height(50.dp)
            .width(380.dp)
            .clip(shape = RoundedCornerShape(size = 12.dp))
            .background(color = MyYellow),
        )
    {
        Text(
            text = "Install",
            fontSize = 25.sp,
            color = Color.Black
        )
    }
}
