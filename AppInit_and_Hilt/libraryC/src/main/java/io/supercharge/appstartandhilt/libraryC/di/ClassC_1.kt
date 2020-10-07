package io.supercharge.appstartandhilt.libraryC.di

import android.content.Context
import androidx.startup.Initializer
import io.supercharge.appstartandhilt.datastore.DataStore
import timber.log.Timber
import javax.inject.Inject

class ClassC_1 : Initializer<DataStore> {

    @Inject
    lateinit var dataStore: DataStore

    override fun create(context: Context): DataStore {
        InitializerEntryPoint.resolve(context).inject(this)
        dataStore.init()

        Timber.e("create()")

        return DataStore()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}
