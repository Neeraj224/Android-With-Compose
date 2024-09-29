package com.example.birthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthday.ui.theme.BirthdayTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource

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
                    GreetingImage(
                        message = stringResource(R.string.happy_birthday_text),
                        from = stringResource(id = R.string.signature_text),
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
            color = Color(red = 0.15f, green = 0.25f, blue = 0.39f, alpha = 0.1f),
            shape = RoundedCornerShape(100.dp),
            modifier = modifier
                .size(300.dp),
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(24.dp)
                        .border(
                            width = 6.dp,
                            color = Color(red = 0.2f, green = 0.1f, blue = 0.5f, alpha = 0.3f),
                            shape = RoundedCornerShape(20.dp)
                        )
                ) {
                    Text(
                        text = message,
                        color = Color(red = 0.2f, green = 0.1f, blue = 0.5f, alpha = 0.5f),
                        fontSize = 40.sp,
                        lineHeight = 40.sp,
                        modifier = Modifier.padding(24.dp)
                    )
                    Box(
                        modifier = Modifier.align(alignment = Alignment.End)
                    ) {
                        Text(
                            text = from,
                            color = Color(red = 0.2f, green = 0.1f, blue = 0.5f, alpha = 0.5f),
                            fontSize = 30.sp,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                }
            }
        }
    }
}

/**
*   Modifiers: An ordered, immutable collection of modifier elements that decorate
*   or add behavior to Compose UI elements. For example, backgrounds, padding
*   and click event listeners decorate or add behavior to rows, text or buttons.
* */
@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    // the painterResource function loads a drawable image resource and takes resource ID
    val image = painterResource(id = R.drawable.androidparty)

    Box(modifier)
    {
        Image(
            painter = image,
            // we'll make the contentDescription null so that TalkBack skips it
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.8F
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize()

        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayPreview() {
    BirthdayTheme {
//        GreetingText(
//            message = "Happy Birthday Sam!",
//            from = "- from Emma"
//        )
        GreetingImage(
            message = stringResource(id = R.string.happy_birthday_text),
            from = stringResource(id = R.string.signature_text)
        )
    }
}
