package com.example.kabadiwalebhaiiya.data

import com.example.kabadiwalebhaiiya.network.ApiService
import retrofit2.Retrofit
import com.jakewharton.retrofit2.converter.kotlinx.serialization
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType

/**
* Dependency Injection container at the application level.
*/
interface AppContainer {
  val productsDatasRepository: ProductsDatasRepository
}

/**
* Implementation for the Dependency Injection container at the application level.
*
* Variables are initialized lazily and the same instance is shared across the whole app.
*/
class DefaultAppContainer : AppContainer {
  private val baseUrl = "https://raw.githubusercontent.com/Jaddu5522/Kabadi_Image/main/products.json"

  /**
  * Use the Retrofit builder to build a retrofit object using a kotlinx.serialization converter
  */
  private val retrofit: Retrofit = Retrofit.Builder()
    .addConverterFactory(Json.asConverterFactory("application/json" .toMediaType()))
    .baseUrl(baseUrl)
    .build()

    /**
    * Refrofit service object for creating api calls
    */
    private val retrofitService: ApiService by lazy {
      retrofit.create(ApiService::class.java)
    }

    /**
    * DI implementation for Products Data repository
    */
    override val productsDatasRepository: ProductsDatasRepository by lazy {
      NetworkProductsDatasRepository(retrofitService)
    }
}
