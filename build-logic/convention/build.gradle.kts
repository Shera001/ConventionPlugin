plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

repositories {
    mavenCentral()
    google()
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "conventionPlugin.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
    }
}