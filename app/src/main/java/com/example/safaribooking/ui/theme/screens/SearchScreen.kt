package com.example.safaribooking.ui.theme.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.safaribooking.R

@Composable
fun SearchScreen(navController: NavController){
Column(
    modifier = Modifier.fillMaxSize()
) {
    Text(text = "Choose a bus")
}
    Box (modifier = Modifier.fillMaxSize()){

    }
}
@Composable
fun ImageCard(painter: Painter, contentDescription:String, title:String){
    Card (
        modifier = Modifier.wrapContentWidth(),
        elevation = CardDefaults.cardElevation(20.dp),
        shape = RectangleShape(10.dp)
    )

        }




@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ImageCardPreview(){
    ImageCard(painter = painterResource(id = R.drawable.bus1),contentDescription = "my card", title = "This is my nature picture")
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SearchScreenPreview() {
    SearchScreen(rememberNavController())

}