package io.supercharge.appstartandhilt.datastore

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataStore2 @Inject constructor() {

    private var initialized = false

    fun init() {
        initialized = true
    }
}
