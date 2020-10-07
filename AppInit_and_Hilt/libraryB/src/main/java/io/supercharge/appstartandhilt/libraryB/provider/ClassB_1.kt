package io.supercharge.appstartandhilt.libraryB.provider

import android.content.Context
import androidx.startup.Initializer
import io.supercharge.appstartandhilt.libraryB.service.DataStore1
import timber.log.Timber

class ClassB_1 : Initializer<DataStore1> {

    override fun create(context: Context): DataStore1 {
        Timber.e("create()")

        return DataStore1()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
//        return listOf(ClassB_2::class.java, ClassB_3::class.java)
        return emptyList()
    }
}
