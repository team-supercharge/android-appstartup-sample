package io.supercharge.appstartandhilt.libraryA.provider

import android.content.Context
import androidx.startup.Initializer
import io.supercharge.appstartandhilt.libraryA.service.DataStore2
import timber.log.Timber

class ClassA_2 : Initializer<DataStore2> {

    override fun create(context: Context): DataStore2 {
        Timber.e("create()")

        return DataStore2()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}
