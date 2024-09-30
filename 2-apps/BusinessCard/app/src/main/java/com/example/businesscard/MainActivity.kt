package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCardScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun BusinessCardScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(0x8183DD9A))
            .padding(top = 16.dp, bottom = 16.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        InfoCardOne(
            name = stringResource(id = R.string.name),
            title = stringResource(id = R.string.title),
        )
        InfoCardTwo(
            number = stringResource(id = R.string.contact_no),
            handle = stringResource(id = R.string.social_media_handle),
            mail = stringResource(id = R.string.mail_id)
        )
    }

}

@Composable
fun InfoCardOne(name: String, title: String, modifier: Modifier = Modifier) {
    Column(
        Modifier.padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(id = R.drawable.android_logo)
        Box(
            modifier = Modifier
                .padding(bottom = 16.dp)
                .background(
                    color = Color(red = 0.027f, green = 0.18f, blue = 0.369f, alpha = 0.886f)
                )
                .clip(RoundedCornerShape(16.dp))
                .size(200.dp)
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(16.dp))
                )
        }

        Text(
            text = name,
            fontSize = 32.sp,
            fontWeight = FontWeight.W400,
            color = Color(red = 0.0f, green = 0.102f, blue = 0.071f, alpha = 0.992f)
        )

        Text(
            text = title,
            fontWeight = FontWeight.W700,
            color = Color(red = 0.008f, green = 0.188f, blue = 0.133f, alpha = 0.702f)
        )
    }
}

@Composable
fun InfoCardTwo(number: String, handle: String, mail: String, modifier: Modifier = Modifier) {
    Column {
        Row(
            Modifier.padding(8.dp)
        ) {
            val phoneImage = painterResource(id = R.drawable.phone_call)
            Image(
                painter = phoneImage,
                contentDescription = null,
                modifier = Modifier.size(24.dp),
                colorFilter = ColorFilter.tint(Color(
                    red = 0.055f,
                    green = 0.408f,
                    blue = 0.306f,
                    alpha = 0.702f
                )
                )
            )
            Text(
                text = number,
                color = Color(red = 0.0f, green = 0.102f, blue = 0.071f, alpha = 0.992f),
                modifier = Modifier.padding(start = 24.dp)
            )
        }

        Row(
            Modifier.padding(8.dp)
        ) {
            val socialImage = painterResource(id = R.drawable.github)
            Image (
                painter = socialImage,
                contentDescription = null,
                modifier = Modifier.size(24.dp),
                colorFilter = ColorFilter.tint(Color(
                    red = 0.055f,
                    green = 0.408f,
                    blue = 0.306f,
                    alpha = 0.702f
                ))
            )
            Text(
                text = handle,
                color = Color(red = 0.0f, green = 0.102f, blue = 0.071f, alpha = 0.992f),
                modifier = Modifier.padding(start = 24.dp)
            )
        }

        Row(
            Modifier.padding(8.dp)
        ) {
            val mailImage = painterResource(id = R.drawable.gmail)
            Image (
                painter = mailImage,
                contentDescription = null,
                modifier = Modifier.size(24.dp),
                colorFilter = ColorFilter.tint(Color(
                    red = 0.055f,
                    green = 0.408f,
                    blue = 0.306f,
                    alpha = 0.702f
                ))
            )
            Text(
                text = mail,
                color = Color(red = 0.0f, green = 0.102f, blue = 0.071f, alpha = 0.992f),
                modifier = Modifier.padding(start = 24.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
//        Greeting("Android")
        BusinessCardScreen()
    }
}