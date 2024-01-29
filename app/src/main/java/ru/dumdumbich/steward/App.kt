package ru.dumdumbich.steward

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import ru.dumdumbich.steward.di.appModule
import ru.dumdumbich.steward.di.dataModule
import ru.dumdumbich.steward.di.domainModule

/**
 * <h3>Steward</h3>
 * @File : App
 * @description
 * <p>Application class</p>
 * @author DumbIch
 * @date 2024-01-20 23:25
 **/

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(listOf(appModule, dataModule, domainModule))
        }
    }
}
