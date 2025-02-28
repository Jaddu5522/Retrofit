package com.example.kabadiwalebhaiiya.data

import com.example.kabadiwalebhaiiya.model.ProductsData
import com.example.kabadiwalebhaiiya.network.ApiService

/**
* Repository that fetch products datas list from Api.
*/

interface ProductsDatasRepository{
  /** Fetches list of ProductsData from Api */
  suspend fun getProductsDatas(): List<ProductData>
}

/**
* Network Implementation of Repository that fetch products datas list from Api.
*/
class NetworkProductsDatasRepository(
  private fun ApiService: ApiService
): ProductsDatasRepository {
  /** Fetches list of ProductData from Api*/
  override suspend fun getProductsDatas(): List<ProductData> = ApiService.getProducts()
}
