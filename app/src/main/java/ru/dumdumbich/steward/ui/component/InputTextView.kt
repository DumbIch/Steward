package ru.dumdumbich.steward.ui.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.dumdumbich.steward.ui.theme.StewardTheme

/**
 * <h3>Steward</h3>
 * @File : InputTextView
 * @description
 * <p>Show Input text view common component</p>
 * @author DumbIch
 * @date 2024-01-21 14:55
 **/

@Composable
fun InputTextView(
    message: String,
    onMessageChange: (String) -> Unit,
    onMessageSend: (String) -> String,
    // WARNING: must be deleted after debugging is complete
    showMessage: (String) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        OutlinedTextField(
            value = message,
            onValueChange = { onMessageChange(it) },
            modifier = Modifier
                .fillMaxWidth(),
            singleLine = true,
            label = { Text("Enter command for smart home device") },
            trailingIcon = {
                IconButton(
//                    onClick = onMessageSend
                    onClick = {
                        // WARNING: must be deleted after debugging is complete
                        showMessage("Send message : ${onMessageSend(message)}")
                        //onMessageSend()
                    }
                ) {
                    Icon(
                        Icons.Filled.Send,
                        contentDescription = "Send command"
                    )
                }
            }
        )
    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InputTextViewPreview() {
    StewardTheme {
        InputTextView(
            message = "Enter your message",
            onMessageChange = {},
            onMessageSend = { "" },
            showMessage = {}
        )
    }
}
