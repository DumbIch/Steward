package ru.dumdumbich.steward.ui.screen.chat

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import ru.dumdumbich.steward.domain.entity.Post
import ru.dumdumbich.steward.domain.usecase.GetChatPostUseCase

/**
 * <h3>Steward</h3>
 * @File : ChatViewModel
 * @description
 * <p>Chat screen view model</p>
 * @author DumbIch
 * @date 2024-01-13 15:00
 **/

class ChatViewModel(private val getChatPost: GetChatPostUseCase) : ViewModel() {

    private var chatList: MutableList<Post> = mutableListOf()
    var chatArray = chatList.toTypedArray() as Array<out Post>
    var messageState: String by mutableStateOf("")

    fun onMessageChangeHandler(message: String) {
        messageState = message
    }

    fun onMessageSendHandler(message: String): String {
        messageState = ""
        return getChatPost().message
    }
}