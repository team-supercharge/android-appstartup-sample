import org.jetbrains.kotlin.config.JvmTarget.*
import org.jetbrains.kotlin.config.KotlinCompilerVersion
import org.jetbrains.kotlin.platform.jvm.JvmPlatforms

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        applicationId = "io.supercharge.appstartandhilt"
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

    kotlinOptions {
        JvmPlatforms.jvmPlatformByTargetVersion(JVM_1_8)
    }

    packagingOptions.exclude("META-INF/main.kotlin_module")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(kotlin("stdlib-jdk8", KotlinCompilerVersion.VERSION))

//    implementation(project(":libraryA"))
//    implementation(project(":libraryB"))
    implementation(project(":libraryC"))
    implementation(project(":datastore"))

    implementation(Dependencies.Kotlin.stdlib)
    implementation(Dependencies.Support.appCompat)
    implementation(Dependencies.Support.constraintLayout)

    implementation(Dependencies.AndroidX.lifecycleExt)
    kapt(Dependencies.AndroidX.lifecycleCompiler)

    // Hilt
    implementation(Dependencies.Dagger.hilt)
    kapt(Dependencies.Dagger.hiltCompiler)
    implementation(Dependencies.Dagger.hiltAndroid)
    kapt(Dependencies.Dagger.hiltAndroidCompiler)

    implementation(Dependencies.AndroidX.workManager)
    implementation(Dependencies.Thirdparty.timber)

//    implementation(Dependencies.AndroidX.startupRuntime)
}

repositories {
    mavenCentral()
    maven("http://repository.jetbrains.com/all")
}