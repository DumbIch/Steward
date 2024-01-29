package ru.dumdumbich.steward.domain.datasource

import ru.dumdumbich.steward.domain.entity.Post

/**
 * <h3>Steward</h3>
 * @File : ChatLogDataSource
 * @description
 * <p>Data source contract: Chat log</p>
 * @author DumbIch
 * @date 2024-01-23 07:42
 **/
interface ChatLogDataSource {
    fun getPost():Post
    fun getPostsArray(): Array<Post>
}