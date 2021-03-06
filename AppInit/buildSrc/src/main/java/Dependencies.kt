object Versions {

    const val kotlinVersion = "1.4.10"
    const val androidPluginVersion = "3.5.2"
    const val appCompat = "1.1.0"
    const val minSdk = 24
    const val compileSdk = 30
    const val constraintLayout = "2.0.0-alpha3"
    const val navigationVersion = "2.1.0"
    const val lifeCycleVersion = "2.0.0"
    const val coroutines = "1.3.2"
    const val workManager = "2.4.0"
    const val startupRuntime = "1.0.0-alpha01"
}

object Dependencies {

    object AndroidX {
        const val lifecycleExt          = "androidx.lifecycle:lifecycle-extensions:${Versions.lifeCycleVersion}"
        const val lifecycleCompiler     = "androidx.lifecycle:lifecycle-compiler:${Versions.lifeCycleVersion}" // kapt
        const val workManager             = "androidx.work:work-runtime-ktx:${Versions.workManager}"
        const val startupRuntime          = "androidx.startup:startup-runtime:${Versions.startupRuntime}"
    }

    object Support {
        const val appCompat                 = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val constraintLayout          = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    }

    object Kotlin {
        const val stdlib                       = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"
        const val coroutines                   = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    }

    object Thirdparty {
        const val timber                     = "com.jakewharton.timber:timber:4.7.1"
    }
}
