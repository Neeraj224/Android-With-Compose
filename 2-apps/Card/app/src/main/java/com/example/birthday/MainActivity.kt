package com.example.birthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthday.ui.theme.BirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
                ) { innerPadding ->
                    GreetingText(
                        message = "Happy Birthday Sam!",
                        from = "- from Emma",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Surface(
            color = Color(red = 0.8f, green = 0.2f, blue = 0.3f, alpha = 0.4f),
            shape = RoundedCornerShape(20.dp),
            modifier = modifier
                .border(2.dp, Color.Black, RoundedCornerShape(20.dp))
                .size(300.dp),
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Column {
                    Text(
                        text = message,
                        fontSize = 40.sp,
                        lineHeight = 40.sp,
                        modifier = Modifier.padding(16.dp)
                    )
                    Box(
                        modifier = Modifier.align(alignment = Alignment.End)
                    ) {
                        Text(
                            text = from,
                            fontSize = 30.sp,
                            modifier = Modifier.padding(16.dp)
                        )
                    }

                }

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BirthdayPreview() {
    BirthdayTheme {
        GreetingText(message = "Happy Birthday Sam!", from = "- from Emma")
    }
}