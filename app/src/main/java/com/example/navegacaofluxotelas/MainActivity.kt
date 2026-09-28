package com.example.navegacaofluxotelas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navegacaofluxotelas.screens.LoginScreen
import com.example.navegacaofluxotelas.screens.MenuScreen
import com.example.navegacaofluxotelas.screens.PedidosScreen
import com.example.navegacaofluxotelas.screens.PerfilScreen
import com.example.navegacaofluxotelas.ui.theme.NavegacaoFluxoTelasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavegacaoFluxoTelasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    LoginScreen()
//                    val navController = rememberNavController()
//
//                    NavHost(
//                        navController = navController,
//                        startDestination = "login"
//                    ){
//                        composable( route = "login" ) { LoginScreen(modifier = Modifier.padding(innerPadding)) }
//
//                        composable( route = "menu" ) { MenuScreen(modifier = Modifier.padding(innerPadding)) }
//
//                        composable( route = "login" ) { PerfilScreen(modifier = Modifier.padding(innerPadding)) }
//
//                        composable( route = "login" ) { PedidosScreen(modifier = Modifier.padding(innerPadding)) }
//                    }
                }
            }
        }
    }
}

// ctrl + option -> para deletar os imports não utilizados