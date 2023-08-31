package br.senai.sp.jandira.saveeats_tcc_ds3t.login.components


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.saveeats_tcc_ds3t.R
import br.senai.sp.jandira.saveeats_tcc_ds3t.components.Botao
import br.senai.sp.jandira.saveeats_tcc_ds3t.components.CaixaDeTexto

@Composable
fun Form() {

    var emailState by remember {
        mutableStateOf("")
    }

    var senhaState by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .padding(5.dp),
        horizontalAlignment = CenterHorizontally
    ) {


        Text(
            text = stringResource(id = R.string.welcome),
            color = Color(41, 95, 27),
            fontWeight = FontWeight(700),
            fontSize = 25.sp

        )
        Text(
            text = stringResource(id = R.string.enter_account),
            fontSize = 14.sp,
            fontWeight = FontWeight(400)

        )

        Spacer(modifier = Modifier.height(30.dp))


        CaixaDeTexto(
            value = stringResource(id = R.string.email),
            aoMudar = {
                emailState = it
            },
            corBorda = Color(72, 138, 39),
            shape = RoundedCornerShape(2.dp),
            icon = painterResource(id = R.drawable.baseline_email_24),
            iconDescricao = ""
        )
        Spacer(modifier = Modifier.height(10.dp))

        CaixaDeTexto(
            value = stringResource(id = R.string.password),
            aoMudar = {
                senhaState = it
            },
            corBorda = Color(72, 138, 39),
            shape = RoundedCornerShape(2.dp),
            icon = painterResource(id = R.drawable.baseline_lock_24),
            iconDescricao = ""
        )

        Text(
            text = stringResource(id = R.string.forget_password),
            modifier = Modifier
                .padding(
                    start = 160.dp,
                    top = 20.dp
                ),
            color = Color(29, 34, 27),
            fontWeight = FontWeight(500)
        )

        Spacer(
            modifier = Modifier
                .height(30.dp)
        )

        Botao(
            aoClick = {},
            texto = stringResource(id = R.string.login),
            corBotao = Color(255, 141, 6),
            modifier = Modifier
                .height(60.dp)
                .width(200.dp),
            fontSize = 20.sp
        )

        Row {
            Text(
                text = stringResource(id = R.string.dont_have_an_account),
                color = Color(29, 34, 27),
                fontWeight = FontWeight(500)
            )

            Spacer(
                modifier = Modifier
                    .width(5.dp)
            )

            Text(
                text = stringResource(id = R.string.singup),
                color = Color(20, 58, 11),
                fontWeight = FontWeight(700)
            )
        }


    }
}

@Preview(showBackground = true)
@Composable
fun FormPreview() {
    Form()
}