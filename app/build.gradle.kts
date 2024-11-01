plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    kotlin("kapt")
}

android {
    namespace = "com.example.myapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapplication"
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
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

    dataBinding {
        enable = true
    }

    kapt {
       correctErrorTypes = true
     }
}

dependencies {

  implementation(libs.epoxy)
  implementation(libs.epoxy.databinding)
  kapt("com.airbnb.android:epoxy-processor:5.1.0")
    // implementation("com.airbnb.android:epoxy:5.1.4")
    //  implementation("com.airbnb.android:epoxy-databinding:epoxy:5.1.4")
    //  kapt("com.airbnb.android:epoxy-processor:5.1.0")

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //glide
    implementation(libs.glide)
    //gson
    implementation(libs.gson)

    //implementation(project(":filter"))

}