package com.example.kabadiwalebhaiiya.network

import com.example.kabadiwalebhaiiya.model.ProductData
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.retrofit
import retrofit2.http.GET

  private const val BASE_URL = ""


/**
* Use the Retrofit builder to build a retrofit object using a kotlinx.serialization converter
*/

private val retrofit = Retrofit.Builder()
  .addConverterFactory(Json.asConverterFactory("application/json" .toMediaType))
  .baseUrl(BASE_URL)
  .build()

/**
* Retrofit service object for creating api calls
  
interface ApiService {
  @GET("products.json")
  suspend fun getProducts(): List<ProductData>
}

/**
* A public Api object that exposes the lazy-initialized Retrofit service
*/
object ProductsApi {
  val retrofitService: ApiService by lazy {
    retrofit.create(ApiService::class.java)
  }
}
