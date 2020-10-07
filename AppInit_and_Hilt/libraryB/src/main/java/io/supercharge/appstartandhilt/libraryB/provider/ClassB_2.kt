package io.supercharge.appstartandhilt.libraryB.provider

import android.content.Context
import androidx.startup.Initializer
import io.supercharge.appstartandhilt.libraryB.service.DataStore2
import timber.log.Timber

class ClassB_2 : Initializer<DataStore2> {

    override fun create(context: Context): DataStore2 {
        Timber.e("create()")

        return DataStore2()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return return listOf(ClassB_3::class.java)
    }
}
