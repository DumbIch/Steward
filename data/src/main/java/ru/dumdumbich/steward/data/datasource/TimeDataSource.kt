package ru.dumdumbich.steward.data.datasource

/**
 * <h3>Steward</h3>
 * @File : TimeDataSource
 * @description
 * <p>Time data source</p>
 * @author DumbIch
 * @date 2024-01-21 00:14
 **/
interface TimeDataSource {
    fun timestamp(): String
}