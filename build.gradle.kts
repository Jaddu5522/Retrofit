dependencies {
  implementation 'com.squareup.retrofit2:retrofit:2.9.0'
  implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
  implementation 'com.squareup.okhttp3:logging-interceptor:4.10.0'

// Room dependencies

  val room_version = "2.6.1"

  implementation("androidx.room:room-runtime:$room_version")

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
}
