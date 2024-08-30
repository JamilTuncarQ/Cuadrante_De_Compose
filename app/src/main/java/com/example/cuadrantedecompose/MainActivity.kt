package com.example.cuadrantedecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantedecompose.ui.theme.CuadranteDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            CuadranteDeComposeTheme {
                Surface (modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.onBackground
                ){
                    GreetingCuadrantes(
                        texto1 = stringResource(R.string.texto_1),
                        texto2 = stringResource(R.string.texto_2),
                        texto3 = stringResource(R.string.texto_3),
                        texto4 = stringResource(R.string.texto_4),
                        texto5 = stringResource(R.string.texto_5),
                        texto6 = stringResource(R.string.texto_6),
                        texto7 = stringResource(R.string.texto_7),
                        texto8 = stringResource(R.string.texto_8)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingCuadrantes(texto1: String, texto2: String, texto3: String, texto4: String, texto5: String, texto6: String, texto7: String, texto8: String, modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.fillMaxSize()
    ){
        Row (
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            Column (
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = texto1,
                    //color = Color.Black,
                    modifier = Modifier
                        .padding(bottom = 16.dp),
                    style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
                    )
                Text(
                    text = texto2,
                    textAlign = TextAlign.Justify
                )
            }
            Column (
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = texto3,
                    modifier = Modifier
                        .padding(bottom = 16.dp),
                    style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = texto4,
                    textAlign = TextAlign.Justify
                )
            }
        }
        Row (
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ){
            Column (
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = texto5,
                    modifier = Modifier
                        .padding(bottom = 16.dp),
                    style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = texto6,
                    textAlign = TextAlign.Justify
                )
            }
            Column (
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = texto7,
                    modifier = Modifier
                        .padding(bottom = 16.dp),
                    style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = texto8,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteDeComposeTheme {
        GreetingCuadrantes(
            texto1 = stringResource(R.string.texto_1),
            texto2 = stringResource(R.string.texto_2),
            texto3 = stringResource(R.string.texto_3),
            texto4 = stringResource(R.string.texto_4),
            texto5 = stringResource(R.string.texto_5),
            texto6 = stringResource(R.string.texto_6),
            texto7 = stringResource(R.string.texto_7),
            texto8 = stringResource(R.string.texto_8)
        )
    }
}