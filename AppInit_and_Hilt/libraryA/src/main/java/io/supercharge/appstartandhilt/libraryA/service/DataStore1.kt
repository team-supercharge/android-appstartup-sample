package io.supercharge.appstartandhilt.libraryA.service

class DataStore1 {
    init {
        isInitialized = true
    }

    companion object {
        var isInitialized = false
    }
}
