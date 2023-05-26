package dev.dineshktech.android

import android.app.Application
import dev.dineshktech.common.di.initKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        // TODO: Change your base url from here
        initKoin(enableNetworkLogs = true, baseUrl = "Your server base url") {}
    }
}
