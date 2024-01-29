package ru.dumdumbich.steward.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.dumdumbich.steward.ui.screen.chat.ChatViewModel

/**
 * <h3>Steward</h3>
 * @File : AppModule
 * @description
 * <p>DI: Application module</p>
 * @author DumbIch
 * @date 2024-01-22 10:52
 **/

val appModule = module {
    viewModel<ChatViewModel> {
        ChatViewModel(getChatPost = get())
    }
}