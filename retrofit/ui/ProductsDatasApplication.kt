package com.example.kabadiwalebhaiiya

import android.app.Application
import com.example.kabadiwalebhaiiya.data.AppContainer
import com.example.kabadiwalebhaiiya.data.DefaultAppContainer

class ProductsDatasApplication : Application() {
  /** AppContainer instance used by the rest of classes to obtain dependencies */
  lateinit var container: AppContainer
  override fun onCreate() {
    super.onCreate()
    container = DefaultAppContainer()
  }
}
