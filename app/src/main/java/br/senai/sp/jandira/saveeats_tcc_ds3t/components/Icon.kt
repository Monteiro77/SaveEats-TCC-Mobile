package br.senai.sp.jandira.saveeats_tcc_ds3t.components

import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter

@Composable
fun Icone(
    painter: Painter,
    descricao: String,
    modifier: Modifier
) {

    Icon(
        painter = painter,
        contentDescription = descricao,
        modifier = modifier
    )

}