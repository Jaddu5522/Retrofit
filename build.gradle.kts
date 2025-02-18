dependencies {
  implementation 'com.squareup.retrofit2:retrofit:2.9.0'
  implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
  implementation 'com.squareup.okhttp3:logging-interceptor:4.10.0'

// Room dependencies

  val room_version = "2.6.1"

  implementation("androidx.room:room-runtime:$room_version")

// Note: - Choose only one of ksp or annotationProcesor. Don't include both.

  // If this project uses any Kotlin source, use Kotlin Symbol Processing
  // See Add the KSP plugin to your project - this is Link for reading on this site page
  ksp("androidx.room:room-compiler:$room_version")

  // If this project only uses Java source, use the Java annotationProcessor
  // No additional plugins are necessary
  annotationProcessor("androidx.room:room-compiler:$room_version")

  // optional - Kotlin Extensions and Coroutines support for Room
  implementation("androidx.room:room-ktx:$room_version")

  // optional - RxJava2 support for Room
  implementation("androidx.room:room-rxjava2:$room_version")

  // optional - RxJava3 support for Room
  implementation("androidx.room:room-rxjava3:$room_version")

  // optional - Guava support for Room, including Optional and ListenableFuture
  implementation("androidx.room:room-guava:$room_version")

  // optional - Test helpers
  implementation("androidx.room:room-testing:$room_version")

  // optional - Paging 3 Integration
  implementation("androidx.room:room-paging:$room_version")


// Retrofit API in Android for fetching the data & loading the data to the Compose Ui.

implementation(libs.androidx.core.ktx)
implementation(libs.androidx.lifecycle.runtime.ktx)
implementation(libs.androidx.activity.compose)
implementation(platform(libs.androidx.compose.bom))
implementation(libs.androidx.ui)
implementation(libs.androidx.ui.graphics)
implementation(libs.androidx.ui.tooling.preview)
implementation(libs.androidx.material3)

// Image loading with Coil in Compose
implementation(libs.coil.kt.coil.compose)


// Coil dependencies from ChatGpt
implementation("io.coil-kt:coil-compose:2.6.0")

// Retrofit for network requests
implementation(libs.squareup.retrofit)
implementation(libs.converter.gson)

// Foundation utilities for Compose
implementation(libs.androidx.foundation)

// ViewModel
implementation(libs.androidx.lifecycle.viewmodel.ktx)

// ViewModel utilities for Compose
implementation(libs.androidx.lifecycle.viewmodel.compose)
implementation(libs.androidx.lifecycle.runtime.ktx)
}
