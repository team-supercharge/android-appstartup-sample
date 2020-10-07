plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        minSdkVersion(24)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    // For Kotlin projects
    kotlinOptions {
        org.jetbrains.kotlin.platform.jvm.JvmPlatforms.jvmPlatformByTargetVersion(org.jetbrains.kotlin.config.JvmTarget.JVM_1_8)
    }

    packagingOptions.exclude("META-INF/main.kotlin_module")
}

dependencies {
    // Kotlin
    implementation(Dependencies.Kotlin.stdlib)
    implementation(Dependencies.Support.appCompat)

    // Hilt
    implementation(Dependencies.Dagger.hilt)
    kapt(Dependencies.Dagger.hiltCompiler)
    implementation(Dependencies.Dagger.hiltAndroid)
    kapt(Dependencies.Dagger.hiltAndroidCompiler)

    implementation(Dependencies.AndroidX.startupRuntime)
    implementation(Dependencies.Thirdparty.timber)
}
