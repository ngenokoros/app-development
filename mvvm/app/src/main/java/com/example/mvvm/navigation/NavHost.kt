package com.example.mvvm.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvm.ui.about.About
import com.example.mvvm.ui.home.Home
import com.example.mvvm.ui.hospital_equipments.Hospital


@Composable
fun AppNavHost(

    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_home

){




  NavHost(navController = navController
      , startDestination =startDestination
  )
  {
      composable(ROUTE_hospital){
          Home( navController =navController)
      }


      composable(ROUTE_home){



      }

     composable(ROUTE_about ) {
         About(navController)

     }
      composable(ROUTE_hospital){
          Hospital(navController)

      }



  }







}