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
import com.example.navegacaofluxotelas.Botao
import com.example.navegacaofluxotelas.Texto

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MenuScreen(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF2C4EC7))
            .padding(32.dp)
    ){
        Texto(
            texto = "Menu"
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp) // espaçamento
        ){
            Botao(
                texto = "Perfil"
            )

            Botao(
                texto = "Pedidos"
            )

            Botao(
                texto = "Sair"
            )
        }
    }
}