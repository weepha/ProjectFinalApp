plugins {
    alias(libs.plugins.android.application)
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.projectfinalapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.projectfinalapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.appcompat) // ถ้า libs นั้นมีอยู่แล้วในไฟล์ build.gradle.kts
    implementation("androidx.appcompat:appcompat:1.2.0")  // ถ้าคุณต้องการเพิ่มเวอร์ชันนี้เอง
    implementation ("com.google.android.material:material:1.2.0")
    implementation ("androidx.activity:activity:1.2.0")
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation(platform("com.google.firebase:firebase-bom:33.11.0"))
    implementation("com.google.firebase:firebase-auth")
    implementation("com.facebook.android:facebook-android-sdk:latest.release")
    implementation ("com.squareup.picasso:picasso:2.8")
}
