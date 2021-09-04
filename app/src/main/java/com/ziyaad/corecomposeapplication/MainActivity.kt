package com.ziyaad.corecomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ziyaad.corecomposeapplication.ui.theme.CoreComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        /* Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            HorizontalColoredBar(color = Color.Yellow)
            HorizontalColoredBar(color = Color.Blue)
            HorizontalColoredBar(color = Color.White)
            HorizontalColoredBar(color = Color.Magenta)
            HorizontalColoredBar(color = Color.Green)
        } */

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalColoredBar(color = Color.Yellow)
            HorizontalColoredBar(color = Color.Blue)
            HorizontalColoredBar(color = Color.White)
            HorizontalColoredBar(color = Color.Magenta)
            HorizontalColoredBar(color = Color.Green)
        }
    }
}

@Composable
fun HorizontalColoredBar(color: Color) {
    Surface(
        color = color,
        modifier = Modifier
            /* For Row
            .height(600.dp)
            .width(60.dp) */

            /* For Column */
            .height(100.dp)
            .width(350.dp)
    ) { }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}
