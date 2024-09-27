package com.example.greet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greet.ui.theme.GreetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Surface(
            color = Color(red = 0.6f, green = 0.1f, blue = 0.3f, alpha = 0.4f),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.padding(16.dp)

        ) {
            Text(
                text = "Hi, my name is $name!",
                modifier = modifier.padding(24.dp)
            )
        }

        Row {
            Surface (
                color = Color(red = 0.27f, green = 0.26f, blue = 0.72f, alpha = 0.4f),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.padding(5.dp)
            ){
                Text(
                    text = "This is me",
                    modifier = modifier.padding(24.dp)
                )
            }

            Surface(
                color = Color(red = 0.1f, green = 0.4f, blue = 0.3f, alpha = 0.4f),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.padding(5.dp)
            ) {
                Text(
                    text = "Composing(?)",
                    modifier = modifier.padding(24.dp)
                )
            }
        }

        Surface(
            color = Color(red = 0.9f, green = 0.6f, blue = 0.1f, alpha = 0.4f),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "where is my mind?",
                modifier = modifier
                    .blur(4.dp)
                    .padding(24.dp)
            )
        }

        Surface(
            color = Color(red = 0.9f, green = 0.2f, blue = 0.2f, alpha = 0.4f),
            shape = RoundedCornerShape(16.dp),
        ) {
            Text(
                text = "ideka",
                modifier = modifier
                    .blur(1.dp)
                    .padding(24.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetTheme {
        Greeting("Neeraj")
    }
}
