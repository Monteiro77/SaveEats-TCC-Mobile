package br.senai.sp.jandira.saveeats_tcc_ds3t.components


import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview




@Composable
fun CaixaDeTexto(
    value: String,
    aoMudar: (String) -> Unit,
    corBorda: Color,
    shape: Shape,
    icon: Painter,
    iconDescricao: String

) {

    OutlinedTextField(

        value = value,
        onValueChange = {
            aoMudar(it)
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = corBorda,
            unfocusedBorderColor = corBorda),
        shape = shape,
        leadingIcon = { Icon(painter = icon, contentDescription = iconDescricao) }
    )


}

@Preview(showBackground = true)
@Composable
fun CaixaDeTextoPreview() {


}