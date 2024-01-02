package ru.dumdumbich.steward.ui.screen.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.dumdumbich.steward.ui.theme.StewardTheme

/**
 * <h3>Steward</h3>
 * @File : DemoScreen
 * @description
 * <p>Test code from book Jetpack Compose 1.3 Essentials</p>
 * @author DumbIch
 * @date 2024-01-01 12:57
 **/

@Composable
fun DemoScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .weight(weight = 0.2f, fill = true)
                .background(Color.Green)
        ) {
            TextCell(
                text = "1",
                modifier = Modifier
                    .background(Color.Gray)
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .weight(weight = 0.4f, fill = true)
                .background(Color.Cyan)
        ) {
            TextCell(
                text = "2",
                modifier = Modifier
                    .background(Color.Gray)
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .weight(weight = 0.3f, fill = true)
                .background(Color.Magenta)
        ) {
            TextCell(
                text = "3",
                modifier = Modifier
                    .background(Color.Gray)
            )
        }

    }
}

@Composable
fun TextCell(text: String, modifier: Modifier = Modifier) {

    val cellModifier = Modifier
        .padding(4.dp)
        .fillMaxWidth()
        .border(width = 4.dp, color = Color.Black)
        .padding(10.dp)
        .clip(shape = RoundedCornerShape(20.dp))
        .size(100.dp, 100.dp)

    Text(
        text = text,
        modifier = cellModifier.then(modifier),
        fontSize = 70.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DemoScreenPreview() {
    StewardTheme {
        DemoScreen()
    }
}
