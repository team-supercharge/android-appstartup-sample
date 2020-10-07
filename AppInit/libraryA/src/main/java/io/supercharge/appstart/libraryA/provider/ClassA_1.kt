package io.supercharge.appstart.libraryA.provider

import android.content.Context
import androidx.startup.Initializer
import io.supercharge.appstart.libraryA.service.DataStore1
import timber.log.Timber

class ClassA_1 : Initializer<DataStore1> {

    override fun create(context: Context): DataStore1 {
        Timber.e("onCreate()")

        return DataStore1()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}
