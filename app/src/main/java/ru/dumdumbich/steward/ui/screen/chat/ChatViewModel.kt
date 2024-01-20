package ru.dumdumbich.steward.ui.screen.chat

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

/**
 * <h3>Steward</h3>
 * @File : ChatViewModel
 * @description
 * <p>Chat screen view model</p>
 * @author DumbIch
 * @date 2024-01-13 15:00
 **/

class ChatViewModel : ViewModel() {

    // WARNING: must be deleted after debugging is complete
    private val postArray = arrayOf(
        Post(
            timestamp = "01.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "01.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "01.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "01.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "01.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value   Temperature less then setting value   Temperature less then setting value"
        ),
        Post(
            timestamp = "01.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "01.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "01.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "01.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "01.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        ),
        Post(
            timestamp = "02.01.2024 17:54",
            source = "Bad Room",
            message = "Temperature less then setting value"
        )
    )

    var chatList: Array<out Post> by mutableStateOf(postArray)
    var messageState: String by mutableStateOf("")

    fun onMessageChangeHandler(message: String) {
        messageState = message
    }

    fun onMessageSendHandler() {
        TODO("ChatViewModel: onMessageSendHandler not implemented")
    }

}