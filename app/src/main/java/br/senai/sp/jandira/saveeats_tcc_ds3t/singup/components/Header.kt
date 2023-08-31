package br.senai.sp.jandira.saveeats_tcc_ds3t.singup.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.saveeats_tcc_ds3t.R
import br.senai.sp.jandira.saveeats_tcc_ds3t.components.Icone

@Composable
fun Header() {
    Box(modifier = Modifier.fillMaxWidth()){
        Icone(
            painter = painterResource(id = R.drawable.baseline_arrow_back_24),
            descricao = "",
            modifier = Modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    Header()
}