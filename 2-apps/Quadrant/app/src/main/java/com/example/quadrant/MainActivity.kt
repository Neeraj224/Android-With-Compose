package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
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
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    QuadrantScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun QuadrantScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            /*
            *   Size the element's width proportional to its weight relative
            *   to other weighted sibling elements in the Row. The parent
            *   will divide the horizontal space remaining after measuring
            *   unweighted child elements and distribute it according to this
            *   weight.
            * */
            Modifier.weight(1f)
        ) {
            QuadrantCard(
                title = stringResource(id = R.string.text_title),
                description = stringResource(id = R.string.text_description),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )

            QuadrantCard(
                title = stringResource(id = R.string.image_title),
                description = stringResource(id = R.string.image_description),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            Modifier.weight(1f)
        ) {
            QuadrantCard(
                title = stringResource(id = R.string.row_title),
                description = stringResource(id = R.string.row_description),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )

            QuadrantCard(
                title = stringResource(id = R.string.column_title),
                description = stringResource(id = R.string.column_description),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun QuadrantCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
        .fillMaxSize()
        .background(backgroundColor.copy(alpha = 0.5f), shape = RoundedCornerShape(4.dp))
        .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantTheme {
        QuadrantScreen()
    }
}