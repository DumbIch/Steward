package ru.dumdumbich.steward.ui.screen.demo

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.math.roundToInt

/**
 * <h3>Steward</h3>
 * @File : DemoViewModel
 * @description
 * <p>Class ViewModel for DemoViewModel app</p>
 * @author DumbIch
 * @date 2024-01-08 13:46
 **/

class DemoViewModel : ViewModel() {

    var isFahrenheit by mutableStateOf(true)
    var result by mutableStateOf("")

    fun convertTemp(temp: String) {

        result = try {
            val tempInt = temp.toInt()

            if (isFahrenheit) {
                ((tempInt - 32) * 0.5556).roundToInt().toString()
            } else {
                ((tempInt * 1.8) + 32).roundToInt().toString()
            }
        } catch (e: Exception) {
            "Invalid Entry"
        }
    }

    fun switchChange() {
        isFahrenheit = !isFahrenheit
    }
}
