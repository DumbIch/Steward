package ru.dumdumbich.steward.ui.screen.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
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
//    Box(Modifier.fillMaxSize().clip(CutCornerShape(30.dp)).background(Color.Blue))
    Box(modifier = Modifier.fillMaxSize().background(Color.LightGray)) {
        TextCell("TopStart", Modifier.align(Alignment.TopStart))
        TextCell("TopCenter", Modifier.align(Alignment.TopCenter))
        TextCell("TopEnd", Modifier.align(Alignment.TopEnd))

        TextCell("CenterStart", Modifier.align(Alignment.CenterStart))
        TextCell("Center", Modifier.align(Alignment.Center))
        TextCell("CenterEnd", Modifier.align(Alignment.CenterEnd))

        TextCell("BottomStart", Modifier.align(Alignment.BottomStart))
        TextCell("BottomCenter", Modifier.align(Alignment.BottomCenter))
        TextCell("BottomEnd", Modifier.align(Alignment.BottomEnd))
    }
}

@Composable
fun TextCell(text: String, modifier: Modifier = Modifier, fontSize: Int = 15) {

    val cellShape = RoundedCornerShape(15.dp)
    val cellModifier = Modifier
        .background(Color.LightGray)
        .padding(4.dp)
/*
        .border(
            width = 5.dp,
            color = Color.Black,
            shape = cellShape
        )
*/
        .clip(shape = cellShape)
        .background(Color.Gray)
        .padding(15.dp)
        //.background(Color.Black)


    Surface(
        modifier = modifier
    ) {
        Text(
            text = text,
            modifier = cellModifier,
            fontSize = fontSize.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color.White
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DemoScreenPreview() {
    StewardTheme {
        DemoScreen()
    }
}
