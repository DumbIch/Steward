package ru.dumdumbich.steward.di

import org.koin.dsl.module
import ru.dumdumbich.steward.domain.usecase.GetChatPostUseCase

/**
 * <h3>Steward</h3>
 * @File : DomainModule
 * @description
 * <p>DI: Domain module</p>
 * @author DumbIch
 * @date 2024-01-22 15:32
 **/

val domainModule = module {
    factory<GetChatPostUseCase> {
        GetChatPostUseCase(dataSource = get())
    }
}