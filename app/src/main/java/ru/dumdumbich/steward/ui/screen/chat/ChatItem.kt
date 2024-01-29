package ru.dumdumbich.steward.ui.screen.chat

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.dumdumbich.steward.domain.entity.Post
import ru.dumdumbich.steward.ui.theme.StewardTheme

/**
 * <h3>Steward</h3>
 * @File : ChatItem
 * @description
 * <p>Chat item: post card</p>
 * @author DumbIch
 * @date 2024-01-13 16:37
 **/

@Composable
fun ChatItem(item: Post, showMessage: (String) -> Unit) {

    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background
        ),
        modifier = Modifier
            .padding(bottom = 8.dp)
            .fillMaxWidth()
            .clickable {
                // WARNING: must be deleted after debugging is complete
                showMessage("Item message ${item.message}")
            },
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {

        Row(
            verticalAlignment = Alignment.Top,
        ) {

            Box(
                contentAlignment = Alignment.CenterStart,
                modifier = Modifier.weight(1F)
            ) {
                Text(
                    text = item.timestamp,
                    fontSize = 12.sp,
                    modifier = Modifier.padding(4.dp)
                )
            }

            Box(
                contentAlignment = Alignment.CenterEnd,
                modifier = Modifier.weight(1F)
            ) {
                Text(
                    text = item.source,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(4.dp)
                )
            }

        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = item.message,
                fontSize = 21.sp,
                modifier = Modifier.padding(4.dp)
            )
        }

    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ChatItemPreview() {
    val post = Post(
        timestamp = "13.01.2024 17:54",
        source = "Bad Room",
        message = "Temperature less then setting value"
    )

    StewardTheme {
        ChatItem(post) {}
    }
}
