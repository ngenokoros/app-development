package com.example.imageactivity

import android.content.Intent
import android.graphics.drawable.shapes.OvalShape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.imageactivity.ui.theme.ImageActivityTheme

class NextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Next()
        }

}
}
@Preview(showBackground = true)
@Composable
fun Next() {
    LazyRow {
//        LazyColumn {
            item {
                Column() {
                    Row() {
                        Column(
                            modifier = Modifier
                                .background(color = Color.LightGray)
//                                .size(200.dp)
                        ) {
                            Row (

                            ){
                                val Next = LocalContext.current
                                Button(
                                    modifier = Modifier
                                        .background(color = Color.Blue),
                                    onClick = {
                                        Next.startActivity(Intent(Next, MainActivity::class.java))
                                    }
                                          ,
                                ) { Text("home") }
                                val home = LocalContext.current
                                OutlinedButton(
                                    modifier = Modifier
                                        .background(color = Color.LightGray),
                                    onClick = {
                                        home.startActivity(Intent(home, MainActivity::class.java))
                                    }

                                ) { Text("home") }
                            }
                            Row(
                                modifier = Modifier
                                    .background(color = Color.Black)
                                    .height( 80.dp)
                            ) {
                                Image(


                                    painter = painterResource(id = R.drawable.aaa),
                                    contentDescription = "image",
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(RoundedCornerShape(percent = 10))


                                )
                                Row ( modifier = Modifier
                                    .size(50.dp)){
                                    Text(
                                        text = "  Always  ",

                                        color = Color.Cyan

                                    )

                                }
                                Text(
                                    text = "be   ",

                                    color = Color.Magenta

                                )

                                 Row(modifier = Modifier
                                     .height(10.dp)) {

                                     Text(
                                         text = "in  ",

                                         color = Color.Red

                                     )
                                 }
                                Text(
                                    text = "touch  ",

                                    color = Color.Green

                                )
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Card(
                                colors = CardDefaults.cardColors(Color.Magenta)
                            ) {

                                Card(colors = CardDefaults.cardColors(Color.Blue)) {


                                    Row(
                                        horizontalArrangement = Arrangement.Absolute.SpaceBetween
                                    ) {

                                        //image

                                        //text


                                    }

                                    Row {
                                        Card(colors = CardDefaults.cardColors(Color.Gray)) {
                                            Column {
                                                Text(text = "                         ")
                                                Row() {
                                                    Image(


                                                        painter = painterResource(id = R.drawable.bb),
                                                        contentDescription = "image",
                                                        modifier = Modifier
                                                            .size(25.dp)
                                                            .clip(RoundedCornerShape(percent = 10))


                                                    )
                                                    Text("AT&T             MEXICO")
                                                }

                                            }
                                            Spacer(modifier = Modifier.height(20.dp))


                                            Text(text = "2gb/60min            $23,10  ")
                                            Spacer(modifier = Modifier.height(20.dp))

                                        }
                                    }


                                }
                                Spacer(modifier = Modifier.height(5.dp))

                                Card(colors = CardDefaults.cardColors(Color.Blue)) {

                                    Row(


                                    ) {
                                        Card(colors = CardDefaults.cardColors(Color.Red)) {

                                            Column {

                                                Text(text = "                            ")
                                                Row {
                                                    Image(


                                                        painter = painterResource(id = R.drawable.cc),
                                                        contentDescription = "image",
                                                        modifier = Modifier
                                                            .size(20.dp)
                                                            .clip(RoundedCornerShape(percent = 10))


                                                    )
                                                    Text("AT&T                    MEXICO")
                                                }
                                                Spacer(modifier = Modifier.width(10.dp))

                                            }

                                            Text(text = "                                                     ")
                                            Spacer(modifier = Modifier.width(10.dp))
                                            Text(text = "2gb/60min            $23,10")
                                            Spacer(modifier = Modifier.width(10.dp))

                                            Text(text = "                              ")

                                        }

                                    }
                                    Spacer(modifier = Modifier.height(5.dp))
                                    Row {
                                        Card(colors = CardDefaults.cardColors(Color.Yellow)) {
                                            Row {
                                                Row { }
                                                Column {
                                                    Text(text = "                                                ")
                                                    Row {
                                                        Image(

                                                            painter = painterResource(id = R.drawable.dd),
                                                            contentDescription = "image",
                                                            modifier = Modifier
                                                                .size(20.dp)
                                                                .clip(RoundedCornerShape(percent = 10))


                                                        )
                                                        Text("AT&T             MEXICO")
                                                    }
                                                }

                                            }

                                            Text(text = "        ")
                                            Text(text = "2gb/60min            $23,10  ")
                                            Text(text = "")
                                        }

                                    }
                                    Spacer(modifier = Modifier.height(5.dp))
                                    Card(
                                        colors = CardDefaults.cardColors(Color.Black)
                                    ) {
                                        Row {
                                            Card(colors = CardDefaults.cardColors(Color.Cyan)) {
                                                Row {
                                                    Row { }
                                                    Column {
                                                        Text(text = "                                                     ")
                                                        Row {
                                                            Image(

                                                                painter = painterResource(id = R.drawable.aa),
                                                                contentDescription = "image",
                                                                modifier = Modifier
                                                                    .size(20.dp)
                                                                    .clip(RoundedCornerShape(percent = 10))


                                                            )
                                                            Text("AT&T                   MEXICO")
                                                        }
                                                    }


                                                }

                                                Text(text = "        ")
                                                Text(text = "2gb/60min            $23,10  ")
                                                Text(text = "")
                                            }

                                        }
                                    }
//                                Column {
//
//                                    Text(text = "                            ")
//                                    Image(
//
//
//                                        painter = painterResource(id = R.drawable.aa),
//                                        contentDescription = "image",
//                                        modifier = Modifier
//                                            .size(20.dp)
//                                            .clip(RoundedCornerShape(percent = 10))
//
//
//                                    )
//                                    Spacer(modifier = Modifier.width(10.dp))
//
//                                }
//
//                                Text(text = "                                                     ")
//                                Spacer(modifier = Modifier.width(10.dp))
//                                Text(text = "2gb/60min            $23,10")
//                                Spacer(modifier = Modifier.width(10.dp))
//
//                                Text(text = "                              ")

                                }
                            }
                        }

                    }
                }
            }


    }
}





