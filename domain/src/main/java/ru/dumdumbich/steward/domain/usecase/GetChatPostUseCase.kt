package ru.dumdumbich.steward.domain.usecase

import ru.dumdumbich.steward.domain.datasource.ChatLogDataSource
import ru.dumdumbich.steward.domain.entity.Post

/**
 * <h3>Steward</h3>
 * @File : GetChatPostUseCase
 * @description
 * <p>Chat use case: Get post</p>
 * @author DumbIch
 * @date 2024-01-23 07:52
 **/

class GetChatPostUseCase(private val dataSource: ChatLogDataSource) {
    operator fun invoke(): Post {
        return dataSource.getPost()
    }

    operator fun invoke(id: Int): Post {
        return dataSource.getPost()
    }
}