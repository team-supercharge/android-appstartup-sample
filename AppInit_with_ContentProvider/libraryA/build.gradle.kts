import org.jetbrains.kotlin.config.JvmTarget
import org.jetbrains.kotlin.platform.jvm.JvmPlatforms.jvmPlatformByTargetVersion

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(Versions.compileSdk)

    defaultConfig {
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.compileSdk)
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

    kotlinOptions {
        jvmPlatformByTargetVersion(JvmTarget.JVM_1_8)
    }

    packagingOptions.exclude("META-INF/main.kotlin_module")
}

dependencies {
    // Kotlin
    implementation(Dependencies.Kotlin.stdlib)
    implementation(Dependencies.Support.appCompat)

    implementation(Dependencies.AndroidX.startupRuntime)
    implementation(Dependencies.Thirdparty.timber)
}
