package com.example.safaribooking.navigation

//import androidx.compose.runtime.Composable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.safaribooking.ui.theme.screens.BookingScreen
import com.example.safaribooking.ui.theme.screens.HomeScreen
import com.example.safaribooking.ui.theme.screens.LoginScreen
import com.example.safaribooking.ui.theme.screens.PaymentScreen
//import com.example.safaribooking.ui.theme.screens.LoginScreen
import com.example.safaribooking.ui.theme.screens.RegisterScreen
import com.example.safaribooking.ui.theme.screens.Seatscreen
import com.example.safaribooking.ui.theme.screens.SplashScreen
//import com.example.safaribooking.ui.theme.screens.TimeScreen

//import com.example.safaribooking.ui.theme.screens.SearchScreen

@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController(),
    startDestination: String= ROUTE_SPLASH){

    NavHost(navController = navController,
        startDestination = startDestination) {
        composable(ROUTE_HOME){ HomeScreen(navController )}
        composable(ROUTE_REGISTER){ RegisterScreen(navController)}
        composable(ROUTE_LOGIN){ LoginScreen(navController)}
        composable(ROUTE_BOOKING){BookingScreen(navController)}
        composable(ROUTE_SPLASH){ SplashScreen(navController)}
        composable(ROUTE_PAYMENT){ PaymentScreen(navController)}
        //composable(ROUTE_TIME){ TimeScreen(navController)}
        composable(ROUTE_SEAT){Seatscreen(navController)}
    }
}





