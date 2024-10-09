package com.example.mvvm.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import com.example.mvvm.navigation.ROUTE_about


@Composable
fun Home(navController: NavController){
    Column {
        Text("home screen")

 

        Text(
            text = "Go to about",
            modifier = Modifier
                .clickable { navController.navigate(ROUTE_about) }

        )



    }


}