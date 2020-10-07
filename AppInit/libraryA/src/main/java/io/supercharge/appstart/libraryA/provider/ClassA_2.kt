package io.supercharge.appstart.libraryA.provider

import android.content.Context
import androidx.startup.Initializer
import io.supercharge.appstart.libraryA.service.DataStore2
import timber.log.Timber

class ClassA_2 : Initializer<DataStore2> {

    override fun create(context: Context): DataStore2 {
        Timber.e("onCreate()")

        return DataStore2()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}
