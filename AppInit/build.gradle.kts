plugins {
    `kotlin-dsl`
}
buildscript {

    val kotlinVersion = Versions.kotlinVersion
    val androidPluginVersion = Versions.androidPluginVersion
    val navigationVersion = Versions.navigationVersion

    repositories {
        jcenter()
        google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${androidPluginVersion}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlinVersion}")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${navigationVersion}")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven { url = uri("https://jitpack.io") }
    }
}

tasks.create("runs every time"){
    println("\nThis is the task that runs every single time, do some awesome stuffs with custom tasks now !!!")
    println ("Running gradle version: ${gradle.gradleVersion}")
}
