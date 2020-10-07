package io.supercharge.appstart.libraryB.provider

import android.content.Context
import androidx.startup.Initializer
import io.supercharge.appstart.libraryB.service.DataStore1
import timber.log.Timber

class ClassB_1 : Initializer<DataStore1> {

    override fun create(context: Context): DataStore1 {
        Timber.e("onCreate()")

        return DataStore1()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return listOf(ClassB_2::class.java, ClassB_3::class.java)
    }
}

