plugins {
  id("com.android.library")
} //ext {
//    PUBLISH_GROUP_ID = 'hu.don.easylut'
//    PUBLISH_ARTIFACT_ID = 'easylut'
//    PUBLISH_VERSION = '0.4'
//}
android {
  namespace = "team.unravel.easylut"
  compileSdk = 34

  defaultConfig {
    minSdk = 21

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    consumerProguardFiles("consumer-rules.pro")

  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
    compileOptions {
      sourceCompatibility = JavaVersion.VERSION_17
      targetCompatibility = JavaVersion.VERSION_17
    }
  }
}

dependencies {
  testImplementation("junit:junit:4.12")
}
//apply from : 'https://raw.githubusercontent.com/blundell/release-android-library/master/android-release-aar.gradle'
