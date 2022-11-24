plugins {
    id("conventionPlugin.android.application")
}

android {
    namespace = "uz.crud.test"

    defaultConfig {
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
}

dependencies {

    implementation(libs.androidx.activity)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.compose.material)
    androidTestImplementation(libs.androidx.test.espresso)
    androidTestImplementation(libs.androidx.test.ext)
    testImplementation(libs.junit)
}