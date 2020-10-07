package io.supercharge.appstartandhilt.libraryA.provider

import android.content.Context
import androidx.startup.Initializer
import io.supercharge.appstartandhilt.libraryA.service.DataStore1
import timber.log.Timber

class ClassA_1 : Initializer<DataStore1> {

    override fun create(context: Context): DataStore1 {
        Timber.e("create()")

        return DataStore1()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}
