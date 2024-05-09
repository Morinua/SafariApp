package com.example.safaribooking.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.safaribooking.navigation.ROUTE_BOOKING
import com.example.safaribooking.navigation.ROUTE_REGISTER

@Composable
fun LoginScreen(navController:NavController){
    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Button(onClick = {
            navController.navigate(ROUTE_BOOKING)
        }, modifier = Modifier.fillMaxWidth(10f)) {
            Text(text = "BOOK NOW",
                color = Color.Blue,
                fontFamily = FontFamily.Cursive)
        }
    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())
}