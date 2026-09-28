package com.example.navegacaofluxotelas.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.navegacaofluxotelas.Botao
import com.example.navegacaofluxotelas.Texto

// option + enter -> importações que faltam -- MAC
// @Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    navController: NavController){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFCE0432))
            .padding(32.dp) // a ordem é importante, se colocar isso antes do background quebra
    ){
        Texto(
            texto = "Login"
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp) // espaçamento
        ){
            Botao(
                onClick = {navController.navigate("menu")},
                texto = "Entrar"
            )
        }
    }
}