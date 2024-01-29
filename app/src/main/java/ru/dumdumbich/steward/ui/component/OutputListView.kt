package ru.dumdumbich.steward.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.dumdumbich.steward.domain.entity.Post
import ru.dumdumbich.steward.ui.screen.chat.ChatItem


/**
 * <h3>Steward</h3>
 * @File : OutputListView
 * @description
 * <p>Show Output list view common component</p>
 * @author DumbIch
 * @date 2024-01-21 15:27
 **/

@Composable
fun OutputListView(
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
