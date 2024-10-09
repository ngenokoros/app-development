package com.example.imageactivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.imageactivity.ui.theme.ImageActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SHOP()
        }
    }
}
@Preview
@Composable
fun SHOP () {

    Column() {
        Row {
            val yy = LocalContext.current
            Text(
                text = "click me",
                modifier = Modifier
                    .clickable {
                        yy.startActivity(Intent(yy, MainActivity::class.java))
                    }

            )






        }
    }
    Column(
        modifier = Modifier
            .background(Color.Transparent)


    )
    
    {

        val home = LocalContext.current
        Button(
            onClick = {
                home.startActivity(Intent(home, MainActivity::class.java))
            }

        ) { Text("home") }



        Column(
            modifier = Modifier
                .background(Color.Cyan)

        ) {
            Text("Creative Tools For ")
            Text("Endless Imaginations ")

            Row {
                Column {

                    Image(

                        painter = painterResource(id = R.drawable.dd),
                        contentDescription = "image",
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(percent = 10))


                    )

                    Text("QWETYUIOP")
                    Text("PRICE$67.00")
                }

                Column {
                    Image(

                        painter = painterResource(id = R.drawable.aa),
                        contentDescription = "image",
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(percent = 10))


                    )
                    Text("QWETYUIOP")
                    Text("PRICE$67.00")

                }
            }
            Row {
                Column {
                    Image(

                        painter = painterResource(id = R.drawable.bb),
                        contentDescription = "image",
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(percent = 10))


                    )
                    Text("QWETYUIOP")
                    Text("PRICE$67.00")
                }
                Column {
                    Image(

                        painter = painterResource(id = R.drawable.cc),
                        contentDescription = "image",
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(percent = 10))


                    )
                    Text("QWETYUIOP")
                    Text("PRICE$67.00")

                }
            }
            Row {
                Column {
                    Image(

                        painter = painterResource(id = R.drawable.ee),
                        contentDescription = "image",
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(percent = 10))


                    )
                    Text("QWETYUIOP")
                    Text("PRICE$67.00")
                }
                Column {
                    Image(

                        painter = painterResource(id = R.drawable.ff),
                        contentDescription = "image",
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(percent = 10))


                    )
                    Text("QWETYUIOP")
                    Text("PRICE$67.00")
                }


            }


        }
    }

}
