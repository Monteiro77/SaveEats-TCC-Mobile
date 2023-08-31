package br.senai.sp.jandira.saveeats_tcc_ds3t.login.screen

import androidx.compose.material.Surface
import br.senai.sp.jandira.saveeats_tcc_ds3t.R
import br.senai.sp.jandira.saveeats_tcc_ds3t.components.Imagem
import br.senai.sp.jandira.saveeats_tcc_ds3t.login.components.Form
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun LoginScreen() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {


                Imagem(
                    modifier = Modifier
                        .size(190.dp)
                        .absoluteOffset(x = -64.dp, y = -46.dp),
                    painter = painterResource(id = R.drawable.prato),
                    descricao = "",

                    )

                Column (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Imagem(
                        modifier = Modifier
                            .size(300.dp)
                            .absoluteOffset(y = -80.dp),
                        painter = painterResource(id = R.drawable.logo),
                        descricao = ""
                    )


                    Box (){

                        Imagem(
                            painter = painterResource(id = R.drawable.hamburguer),
                            descricao = "",
                            modifier = Modifier
                                .absoluteOffset(x = -200.dp, y = 30.dp)
                                .size(400.dp)
                        )

                        Imagem(
                            painter = painterResource(id = R.drawable.pao),
                            descricao = "",
                            modifier = Modifier
                                .size(400.dp)
                                .absoluteOffset(x = 80.dp, y = -200.dp)
                        )

                        Column (
                            modifier = Modifier
                                .fillMaxWidth()
                                .absoluteOffset(y = -100.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Form()
                        }
                    }
                }
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}