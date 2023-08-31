package br.senai.sp.jandira.saveeats_tcc_ds3t.components

import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit

@Composable
fun Botao(
    aoClick: (String) -> Unit,
    texto:String,
    corBotao: Color,
    modifier: Modifier,
    fontSize: TextUnit

): Unit {

    Button(
        modifier = modifier,
        onClick = { aoClick },
        colors = ButtonDefaults.buttonColors(corBotao)

        ) {

        Text(
            text = texto,
            fontSize = fontSize
        )
    }
}

@Preview
@Composable
fun BotaoPreview() {

}