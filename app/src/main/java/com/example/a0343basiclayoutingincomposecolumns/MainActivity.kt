package com.example.a0343basiclayoutingincomposecolumns

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                content = {
                    PaddingValues -> Box(modifier = Modifier.padding(PaddingValues)){
                     Column(
                         modifier = Modifier.fillMaxSize(),
                         verticalArrangement = Arrangement.SpaceEvenly,
                         horizontalAlignment = Alignment.CenterHorizontally

                     ) {
                         Text(text = "Mohammed", color = Color.Red)
                         Text(text = "Ali", color = Color.Blue)
                         Text(text = "Ahmed", color = Color.Green)
                     }
                }
                }
            )
        }
    }
}


