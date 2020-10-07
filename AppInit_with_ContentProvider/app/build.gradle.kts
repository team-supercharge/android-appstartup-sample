import org.jetbrains.kotlin.config.JvmTarget
import org.jetbrains.kotlin.config.KotlinCompilerVersion
import org.jetbrains.kotlin.platform.jvm.JvmPlatforms.jvmPlatformByTargetVersion

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(Versions.compileSdk)

    defaultConfig {
        applicationId = "io.supercharge.appstart"
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
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(kotlin("stdlib-jdk8", KotlinCompilerVersion.VERSION))

    implementation(project(":libraryA"))
    implementation(project(":libraryB"))

    implementation(Dependencies.Kotlin.stdlib)
    implementation(Dependencies.Support.appCompat)
    implementation(Dependencies.Support.constraintLayout)

    implementation(Dependencies.AndroidX.lifecycleExt)
    kapt(Dependencies.AndroidX.lifecycleCompiler)
    implementation(Dependencies.AndroidX.workManager)
    implementation(Dependencies.Thirdparty.timber)
}

repositories {
    mavenCentral()
    maven("http://repository.jetbrains.com/all")
}
