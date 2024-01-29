package ru.dumdumbich.steward.data.datasource

import ru.dumdumbich.steward.domain.datasource.ChatLogDataSource
import ru.dumdumbich.steward.domain.entity.Post

/**
 * <h3>Steward</h3>
 * @File : ChatLogDataSourceImpl
 * @description
 * <p>Data source implementation: Chat log</p>
 * @author DumbIch
 * @date 2024-01-21 00:04
 **/
class ChatLogDataSourceImpl() : ChatLogDataSource {
    override fun getPost():Post {
        return getFakePost()
    }

    override fun getPostsArray():Array<Post> {
        return getFakePostsList()
    }

    private fun getFakePost() = Post(
        timestamp = "01.01.2024 17:54",
        source = "Bad Room",
        message = "Temperature less then setting value"
    )

    private fun getFakePostsList() = arrayOf(
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

}