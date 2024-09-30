package com.example.article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.article.ui.theme.ArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArticleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Article(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ArticleText(title: String, paragraph1: String, paragraph2: String, modifier: Modifier = Modifier) {
    Box(modifier = Modifier) {
        Column{
            Text(
                text = title,
                modifier = Modifier.padding(16.dp),
                fontSize = 24.sp
            )
            Text(
                text = paragraph1,
                modifier = Modifier.padding(
                    start = 16.dp,
                    top = 1.dp,
                    end = 16.dp,
                    bottom = 1.dp
                ),
                textAlign = TextAlign.Justify
            )
            Text(
                text = paragraph2,
                modifier = Modifier.padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                ),
                textAlign = TextAlign.Justify
            )
        }
    }

}

@Composable
fun ArticleImage(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(painter = image, contentDescription = null)
}

@Composable
fun Article(modifier: Modifier) {
    Column(
        modifier = Modifier.padding(
            start = 0.dp,
            top = 44.dp,
            end = 0.dp,
            bottom = 0.dp
        )
    ) {
        ArticleImage()
        ArticleText(
            title = stringResource(id = R.string.article_title),
            paragraph1 = stringResource(id = R.string.article_paragraph_one),
            paragraph2 = stringResource(id = R.string.Article_paragraph_two),
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticleTheme {
        Article(modifier = Modifier)
    }
}