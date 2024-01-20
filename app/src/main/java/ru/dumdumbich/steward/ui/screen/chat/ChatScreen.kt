package ru.dumdumbich.steward.ui.screen.chat

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import ru.dumdumbich.steward.ui.theme.StewardTheme

/**
 * <h3>Steward</h3>
 * @File : ChatScreen
 * @description
 * <p>Chat screen compose component</p>
 * @author DumbIch
 * @date 2024-01-13 14:59
 **/


@Composable
fun ChatScreenSetup(viewModel: ChatViewModel = viewModel()) {
    ChatScreen(
        postArray = viewModel.chatList,
        chatMessage = viewModel.messageState,
        onMessageChangeHandler = { viewModel.onMessageChangeHandler(it) },
        onMessageSendHandler = { viewModel.onMessageSendHandler() }
    )
}


@Composable
fun ChatScreen(
    postArray: Array<out Post>,
    chatMessage: String,
    onMessageChangeHandler: (String) -> Unit,
    onMessageSendHandler: () -> Unit
) {

    // WARNING: must be deleted after debugging is complete
    val context = LocalContext.current
    val showToastMessage = { text: String ->
        Toast.makeText(
            context,
            text,
            Toast.LENGTH_SHORT
        ).show()
    }

    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .padding(4.dp)
            .fillMaxSize()
    ) {
        ChatListBox(
            list = postArray,
            // WARNING: must be deleted after debugging is complete
            showMessage = showToastMessage,
            modifier = Modifier.weight(1F)
        )
        InputMessageTextRow(
            message = chatMessage,
            onMessageChange = onMessageChangeHandler,
            onMessageSend = onMessageSendHandler,
            // WARNING: must be deleted after debugging is complete
            showMessage = showToastMessage
        )
    }
}


@Composable
fun ChatListBox(
    list: Array<out Post>,
    // WARNING: must be deleted after debugging is complete
    showMessage: (String) -> Unit,
    modifier: Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .then(modifier)
    ) {
        LazyColumn {
            items(list) { model ->
                ChatItem(
                    item = model,
                    // WARNING: must be deleted after debugging is complete
                    showMessage = showMessage
                )
            }
        }
    }

}


@Composable
fun InputMessageTextRow(
    message: String,
    onMessageChange: (String) -> Unit,
    onMessageSend: () -> Unit,
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
                        showMessage("Input message : $message")

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
fun ChatScreenPreview() {
    val postArray: Array<Post> = arrayOf(
        Post(
            timestamp = "01.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "02.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "03.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "04.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "05.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "06.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "07.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "08.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "09.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "10.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "11.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "12.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "13.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "14.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "15.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "16.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "17.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "18.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "19.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "20.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "21.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
    )

    StewardTheme {
        ChatScreen(postArray, "", {}, {})
    }
}
