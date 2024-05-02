plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.skyhookicks"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.skyhookicks"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testApplicationId = "com.example.skyhookicks.tests"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"



    }
    testOptions {
        reportDir="$project.buildDir/results/report"
        resultsDir="$project.buildDir/results"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}