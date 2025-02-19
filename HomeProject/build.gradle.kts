
   plugins {
      //id("com.android.application") version "5.4.2" apply false
      alias(libs.plugins.android.application) apply false
      id("com.google.gms.google-services") version "4.4.2" apply false
      id("com.google.firebase.firebase-perf") version "1.4.2" apply false
   }


buildscript{
   repositories {
      google()
      mavenCentral()
      maven("https://maven.google.com")
      maven("https - FORBIDDEN - your-private-repo - FORBIDDEN - /maven")
   }
}

