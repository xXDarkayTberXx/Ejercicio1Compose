package com.example.ejercicio1compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.ejercicio1compose.ui.theme.Ejercicio1ComposeTheme
import kotlin.math.ceil

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio1ComposeTheme {
                ComplexLayout()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppView() {
    Ejercicio1ComposeTheme {
        ComplexLayout()
    }
}

@Composable
fun ComplexLayout() {
    Column(modifier = Modifier
        .fillMaxSize()){
        Box(modifier = Modifier
            .fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Text("Título", fontSize = 60.sp)
        }
        Box(modifier = Modifier
            .fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Text("Subtítulo", fontSize = 30.sp)
        }
        Row (modifier = Modifier
            .fillMaxWidth(), Arrangement.SpaceEvenly){
            Box(){
                Text("Opción 1")
            }
            Box(){
                Text("Opción 2")
            }
            Box(){
                Text("Opción 3")
            }
        }
        Row (modifier = Modifier
            .fillMaxWidth(), Arrangement.SpaceEvenly){
            Box(){
                Text("Texto 1")
            }
            Box(){
                Text("Texto 2")
            }
            Box(){
                Text("Texto 3")
            }
        }
    }
}
