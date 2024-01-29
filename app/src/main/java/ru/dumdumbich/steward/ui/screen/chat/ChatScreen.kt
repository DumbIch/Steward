package ru.dumdumbich.steward.ui.screen.chat

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.koin.androidx.compose.koinViewModel
import ru.dumdumbich.steward.domain.entity.Post
import ru.dumdumbich.steward.ui.component.InputTextView
import ru.dumdumbich.steward.ui.component.OutputListView
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
fun ChatScreenSetup(viewModel: ChatViewModel = koinViewModel()) {
    ChatScreen(
        postArray = viewModel.chatArray,
        chatMessage = viewModel.messageState,
        onMessageChangeHandler = { viewModel.onMessageChangeHandler(it) },
        onMessageSendHandler = { viewModel.onMessageSendHandler(it) }
    )
}


@Composable
fun ChatScreen(
    postArray: Array<out Post>,
    chatMessage: String,
    onMessageChangeHandler: (String) -> Unit,
    onMessageSendHandler: (String) -> String
    //onMessageSendHandler: () -> Unit
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
        OutputListView(
            list = postArray,
            // WARNING: must be deleted after debugging is complete
            showMessage = showToastMessage,
            modifier = Modifier.weight(1F)
        )
        InputTextView(
            message = chatMessage,
            onMessageChange = onMessageChangeHandler,
            onMessageSend = onMessageSendHandler,
            // WARNING: must be deleted after debugging is complete
            showMessage = showToastMessage
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
        ChatScreen(postArray, "", {}, {""})
    }
}
