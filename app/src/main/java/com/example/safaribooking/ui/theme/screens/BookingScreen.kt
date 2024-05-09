package com.example.safaribooking.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.safaribooking.R
import com.example.safaribooking.navigation.ROUTE_SEARCH

@Composable

fun BookingScreen(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)

    {

        Text(text = "Search for your favourite destiation here",
            color = Color.Blue,
            fontFamily = FontFamily.SansSerif,
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = "", onValueChange = { },
            label = { Text(text = "From") },

            keyboardOptions = KeyboardOptions . Default . copy (imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),

            )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value ="" , onValueChange = {},
            label = { Text(text = "To") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value ="" , onValueChange = {},
            label = { Text(text = "Travel Date") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(ROUTE_SEARCH)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "SEARCH BUS")
        }

    }
}
@Composable
fun ImageCard(painter: Painter,contentDescription:String,title:String){
    Card (
        modifier = Modifier.fillMaxSize(),
        elevation = CardDefaults.cardElevation(20.dp),

    )
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ImageCardPreview(){
    ImageCard(painter = painterResource(id = R.drawable.bus1),contentDescription = "my card", title = "This is my nature picture")
}




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BookingScreenPreview() {
    BookingScreen(rememberNavController())

}