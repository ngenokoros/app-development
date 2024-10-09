package com.example.imageactivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.imageactivity.ui.theme.ImageActivityTheme

class APPSCREEN : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImageActivityTheme {
                SCREEN()
            }
        }
    }

}
    @Preview(showBackground = true)
    @Composable
    fun SCREEN() {
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(horizontal = 10.dp).padding(vertical = 30.dp)
//
//        ) {
//            Text("Where you")
//            Text("wana go?")
//            Row {
//                Row {
//                    Column {
//
//
//                        Image(
//
//                            painter = painterResource(id = R.drawable.dd),
//                            contentDescription = "image",
//                            modifier = Modifier
//                                .size(200.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//
//
//                        )
//                    }
//                    Spacer(modifier = Modifier.height(60.dp))
//                    Column {
//                        Image(
//
//                            painter = painterResource(id = R.drawable.aa),
//                            contentDescription = "image",
//                            modifier = Modifier
//                                .size(300.dp)
//                                .clip(RoundedCornerShape(percent = 10))
//
//
//                        )
//
//
//                    }
//                    Spacer(modifier = Modifier.height(200.dp))
//                }
//                Column {
//                    Image(
//
//                        painter = painterResource(id = R.drawable.aa),
//                        contentDescription = "image",
//                        modifier = Modifier
//                            .size(300.dp)
//                            .clip(RoundedCornerShape(percent = 10))
//
//
//                    )
//
//
//                }
//            }
//
//
//        }
//    }
//}
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier

        ) {
            Text("    Where you ",
                    fontSize = 40. sp,
                color = Color .Black,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold)



            Text("    wonna go? ",
                    fontSize = 40. sp,
                color = Color .Black,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold)


            Row {


                Column(
                    modifier = Modifier
                        .background(Color.Yellow)


                )

                {

                }
                Card() {
                val vv = LocalContext.current
                Button(
                    onClick = {
                        vv.startActivity(Intent(vv, MainActivity::class.java))
                    }

                ) { Text("HOTEL") }
                    }

                val ww = LocalContext.current
                OutlinedButton (
                    onClick = {
                        ww.startActivity(Intent(ww, MainActivity::class.java))
                    }

                ) { Text("HOTEL") }

                val HOTEL = LocalContext.current
                    Button(
                        onClick = {
                            HOTEL.startActivity(Intent(HOTEL, MainActivity::class.java))
                        }

                    ) { Text("HOTEL") }

                    val home = LocalContext.current
                    Button(
                        onClick = {
                            home.startActivity(Intent(home, MainActivity::class.java))
                        }

                    ) { Text("home") }

                }

                    Column(
                        modifier = Modifier
                            .background(Color.White)
                            .fillMaxSize()

                    ) {
                        Spacer(modifier = Modifier.height(50.dp))

                        Column {
                            Text(
                                text = "    Popular Hotel",
                                fontSize = 50.sp,
                                color = Color.Black,
                                fontFamily = FontFamily.Cursive,
                                fontWeight = FontWeight.ExtraBold
                            )

                        }
                        Column {
                        Row(

                        ) {

                            Column(
//                                horizontalAlignment = Alignment.CenterHorizontally,
//                                verticalArrangement = Arrangement.SpaceBetween


                            ) {
                                Image(

                                    painter = painterResource(id = R.drawable.cwd),
                                    contentDescription = "image",
                                    modifier = Modifier
                                        .size(200.dp)
                                        .clip(RoundedCornerShape(percent = 40))


                                )

                                Column(
                                    modifier = Modifier

                                ) {
                                    Spacer(modifier = Modifier.height(50.dp))
                                    Text(
                                        text = "     Hot Deals    ",
                                        fontSize = 50.sp,
                                        color = Color.Black,
                                        fontFamily = FontFamily.Cursive,
                                        fontWeight = FontWeight.ExtraBold
                                    )
//                                       Text("see all"),

                                }
                            }
                            Column {
                                Image(

                                    painter = painterResource(id = R.drawable.dwd),
                                    contentDescription = "image",
                                    modifier = Modifier
                                        .size(200.dp)
                                        .clip(RoundedCornerShape(percent = 30))


                                )

                            }
                        }
                    }
                        Row(horizontalArrangement = Arrangement.Center) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Image(

                                    painter = painterResource(id = R.drawable.ff),
                                    contentDescription = "image",
                                    modifier = Modifier
                                        .size(400.dp)
                                        .clip(RoundedCornerShape(percent = 40))


                                )
                                Text("QWETYUIOP")
                                Text("PRICE$67.00")

                            }

                        }
                    }


                }

        }




