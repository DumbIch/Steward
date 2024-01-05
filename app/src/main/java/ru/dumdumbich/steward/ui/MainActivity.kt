package ru.dumdumbich.steward.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import ru.dumdumbich.steward.R
import ru.dumdumbich.steward.ui.screen.demo.DemoScreen
import ru.dumdumbich.steward.ui.theme.StewardTheme

class MainActivity : ComponentActivity() {

    //private var itemArray: Array<String>? = null
    private lateinit var itemArray: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        itemArray = resources.getStringArray(R.array.car_array)
        super.onCreate(savedInstanceState)
        setContent {
            StewardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DemoScreen(itemArray = itemArray as Array<out String>)
                }
            }
        }
    }
}
