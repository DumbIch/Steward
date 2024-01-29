package ru.dumdumbich.steward.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.dumdumbich.steward.R
import ru.dumdumbich.steward.ui.theme.StewardTheme

/**
 * <h3>Steward</h3>
 * @File : ErrorView
 * @description
 * <p>Show error view common component</p>
 * @author DumbIch
 * @date 2024-01-21 12:31
 **/

@Composable
fun ErrorView(message: String, onClickRetry: () -> Unit, onClickAbort: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(message)
        Spacer(Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Absolute.SpaceEvenly
        ) {
            Button(onClick = onClickAbort) {
                Text(text = stringResource(id = R.string.abort))
            }
            Button(onClick = onClickRetry) {
                Text(text = stringResource(id = R.string.retry))
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ErrorViewPreview() {
    StewardTheme {
        ErrorView(message = "Error 404", {}, {})
    }
}
