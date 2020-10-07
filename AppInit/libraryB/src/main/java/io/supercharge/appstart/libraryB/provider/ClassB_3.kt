package io.supercharge.appstart.libraryB.provider

import android.content.Context
import androidx.startup.Initializer
import io.supercharge.appstart.libraryB.service.DataStore3
import timber.log.Timber

class ClassB_3 : Initializer<DataStore3> {

    override fun create(context: Context): DataStore3 {
        Timber.e("onCreate()")

        return DataStore3()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}
