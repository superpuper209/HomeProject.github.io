import com.android.build.gradle.tasks.getPrefabFromMaven
import com.android.builder.utils.agpReferenceDocsUrl

plugins {
    alias(libs.plugins.android.application)
    id("com.google.firebase.firebase-perf")
}

android {
    namespace = "com.example.no_name_hochu_babok"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.no_name_hochu_babok"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"


        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",

            )
        }
        buildFeatures {
            viewBinding to true
        }

    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8

    }
    buildFeatures {
        viewBinding = true
    }
    buildToolsVersion = "35.0.0"
    ndkVersion = "28.0.12433566 rc1"
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.play.services.measurement.api)
    implementation(libs.firebase.messaging)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)


    implementation("com.google.firebase:firebase-bom:33.7.0")
    implementation("com.google.firebase:firebase-core:21.1.1")
    implementation("com.google.firebase:firebase-database:21.0.0")
    implementation("com.google.firebase:firebase-auth:23.1.0")
    implementation ("com.firebaseui:firebase-ui-database:8.0.2")
    implementation ("com.firebaseui:firebase-ui-auth:8.0.2")

    implementation ("com.github.rey5137:material:1.3.1")

    implementation ("androidx.appcompat:appcompat:1.7.0")
    implementation ("androidx.cardview:cardview:1.0.0")
   // implementation ("androidx.recyclerview:recyclerview:1.4.0")

    implementation ("io.github.pilgr:paperdb:2.7.2")


}
apply(plugin = ("com.google.gms.google-services"))

