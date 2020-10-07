package io.supercharge.appstart.app

import android.app.Application
import timber.log.Timber

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.e("onCreate()")
    }
}
