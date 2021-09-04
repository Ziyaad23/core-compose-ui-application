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
fun MainScreen(){
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()) {
        Row() {
            Surface(
                color = Color.Magenta,
                modifier = Modifier
                    .height(600.dp)
                    .width(60.dp)
            ){ }
            Surface(
                color = Color.Red,
                modifier = Modifier
                    .height(600.dp)
                    .width(60.dp)
            ){ }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}

//Text(
//text = "Wrapped content",
//style = MaterialTheme.typography.h4
//)