package com.example.safaribooking.ui.theme.screens

import android.annotation.SuppressLint
import android.graphics.Color
import android.text.Layout.Alignment
import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.safaribooking.R
import com.example.safaribooking.navigation.ROUTE_HOME
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.reflect.Modifier

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){
    Column(
       modifier = androidx.compose.ui.Modifier
           .fillMaxSize()
           .background(androidx.compose.ui.graphics.Color.Cyan),
       // horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(text = "SAFARI BOOKING",
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.SansSerif,
            color = androidx.compose.ui.graphics.Color.Black,
            fontSize = 40.sp)

        val coroutine= rememberCoroutineScope()
        coroutine.launch {
            delay(1500)
            navController.navigate(ROUTE_HOME)
        }
        Image(painter = painterResource(id = R.drawable.b3),
            contentDescription = "splash",
            contentScale = ContentScale.Fit,
            modifier = androidx.compose.ui.Modifier
                .size(400.dp)
                .clip(RectangleShape)
                .fillMaxSize()

            )

    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}