package br.senai.sp.jandira.saveeats_tcc_ds3t.singup.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.saveeats_tcc_ds3t.R
import br.senai.sp.jandira.saveeats_tcc_ds3t.components.CaixaDeTexto

@Composable
fun Form() {
    Column(
        modifier = Modifier
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = stringResource(id = R.string.singup),
            color = Color(41,95,27),
            fontWeight = FontWeight(700),
            fontSize = 25.sp
        )
        Text(
            text = stringResource(id = R.string.create_your_account),
            fontSize = 14.sp,
            fontWeight = FontWeight(400)
        )

        Spacer(
            modifier = Modifier
                .height(30.dp)
        )

        CaixaDeTexto(
            value = stringResource(id = R.string.name),
            aoMudar = {},
            corBorda = Color(72,138,39),
            shape = RoundedCornerShape(2.dp),
            icon = painterResource(id = R.drawable.baseline_person_24),
            iconDescricao = "Person"
        )

        Spacer(
            modifier = Modifier
                .height(12.dp)
            )
        CaixaDeTexto(
            value = stringResource(id = R.string.ssn),
            aoMudar = {},
            corBorda = Color(72,138,39),
            shape = RoundedCornerShape(2.dp),
            icon = painterResource(id = R.drawable.baseline_wallet_24),
            iconDescricao = "Person"
        )

        Spacer(
            modifier = Modifier
                .height(12.dp)
        )

        CaixaDeTexto(
            value = stringResource(id = R.string.zipcode),
            aoMudar = {},
            corBorda = Color(72,138,39),
            shape = RoundedCornerShape(2.dp),
            icon = painterResource(id = R.drawable.baseline_place_24),
            iconDescricao = "Person"
        )

        Spacer(
            modifier = Modifier
                .height(12.dp)
        )

        CaixaDeTexto(
            value = stringResource(id = R.string.number),
            aoMudar = {},
            corBorda = Color(72,138,39),
            shape = RoundedCornerShape(2.dp),
            icon = painterResource(id = R.drawable.baseline_local_phone_24),
            iconDescricao = "Person"
        )

        Spacer(
            modifier = Modifier
                .height(30.dp)

        )




    }
}

@Preview(showBackground = true)
@Composable
fun FormPreview() {
    Form()
}