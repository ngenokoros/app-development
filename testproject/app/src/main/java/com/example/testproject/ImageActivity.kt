package com.example.testproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class imageactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            picha()

        }
        }
    }



@Preview(showBackground = true)
@Composable
fun picha() {
    Column {

        Image(

            painter = painterResource(id = R.drawable.dd),
            contentDescription = "image",
            modifier = Modifier
                .size(150.dp)
                .clip(RoundedCornerShape(percent = 10))
                .border(5.dp, Color.Magenta ))
            }


















    }













