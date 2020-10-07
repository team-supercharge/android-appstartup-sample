package io.supercharge.appstartandhilt.libraryB.provider

import android.content.Context
import androidx.startup.Initializer
import io.supercharge.appstartandhilt.libraryB.service.DataStore3
import timber.log.Timber

class ClassB_3 : Initializer<DataStore3> {

    override fun create(context: Context): DataStore3 {
        Timber.e("create()")

        return DataStore3()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}
