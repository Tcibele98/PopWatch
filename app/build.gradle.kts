plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.popwatch.mvp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.popwatch.mvp"
        minSdk = 26
        targetSdk = 35
        versionCode = 2
        versionName = "0.1.1"
    
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }

        debug {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
}
