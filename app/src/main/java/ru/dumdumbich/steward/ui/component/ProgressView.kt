package ru.dumdumbich.steward.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.dumdumbich.steward.ui.theme.StewardTheme

/**
 * <h3>Steward</h3>
 * @File : ProgressView
 * @description
 * <p>Show progress view common component</p>
 * @author DumbIch
 * @date 2024-01-21 14:08
 **/

@Composable
fun ProgressView() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        CircularProgressIndicator()
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProgressViewPreview() {
    StewardTheme {
        ProgressView()
    }
}
