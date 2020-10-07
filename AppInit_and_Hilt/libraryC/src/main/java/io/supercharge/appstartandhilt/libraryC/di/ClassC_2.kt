package io.supercharge.appstartandhilt.libraryC.di

import android.content.Context
import androidx.startup.Initializer
import io.supercharge.appstartandhilt.datastore.DataStore2
import timber.log.Timber
import javax.inject.Inject

class ClassC_2 : Initializer<DataStore2> {

    @Inject
    lateinit var dataStore2: DataStore2

    override fun create(context: Context): DataStore2 {
        InitializerEntryPoint.resolve(context).inject(this)
        dataStore2.init()

        Timber.e("create()")

        return DataStore2()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}
