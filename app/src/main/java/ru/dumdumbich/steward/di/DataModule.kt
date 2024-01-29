package ru.dumdumbich.steward.di

import org.koin.dsl.module
import ru.dumdumbich.steward.data.datasource.ChatLogDataSourceImpl
import ru.dumdumbich.steward.domain.datasource.ChatLogDataSource

/**
 * <h3>Steward</h3>
 * @File : DataModule
 * @description
 * <p>DI: Data module</p>
 * @author DumbIch
 * @date 2024-01-22 15:31
 **/

val dataModule = module {
    single<ChatLogDataSource> {
        ChatLogDataSourceImpl()
    }
}