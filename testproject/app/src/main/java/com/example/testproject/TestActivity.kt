package com.example.testproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.createFontFamilyResolver
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testproject.ui.theme.TestProjectTheme

class TestActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           About ()
    }
}
}


@Preview(showBackground = true)
@Composable
fun About(){

//    Row {
//        Text( "This is my first row")
//        Text("CONTENT OF A ROW")
//
//    }
    Column (


        modifier = Modifier

            .fillMaxWidth()

            .background(Color.Black),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween





    ){




        Text("THIS IS THE ABOUT SCREEN",
            fontSize = 20 . sp,
            color = Color .White,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold
            )


        Text( " text two" ,
            fontSize = 30. sp,
            fontFamily = FontFamily.Serif,
            color = Color .Black,
            fontWeight = FontWeight.W800,
            modifier = Modifier
                .background( Color.LightGray)
                .fillMaxHeight(),



        )


}


}