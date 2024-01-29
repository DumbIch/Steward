package ru.dumdumbich.steward.domain.entity

/**
 * <h3>Steward</h3>
 * @File : Post
 * @description
 * <p>Entity: Message from the controller to the operator</p>
 * @author DumbIch
 * @date 2024-01-22 07:14
 **/

data class Post(
    val timestamp: String,
    val source: String,
    val message: String
)
