package com.example.kabadiwalebhaiiya.network

import com.example.kabadiwalebhaiiya.model.ProductData
import retrofit2.http.GET

/**
* A public interface that exposes the [getProducts] method
*/

interface ApiService {
  /**
  * Returns a [List] of [ProductData] and this method can be called from a Coroutine.
  * The @GET annotation indicates that the 'products.json' endpoint will be requestedw with the GET  
  * HTTP method
  @GET("products.json")
  suspend fun getProducts(): List<ProductData>
}
