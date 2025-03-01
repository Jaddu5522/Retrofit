package com.example.kabadiwalebhaiiya.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewMdel
import androidx.lifecycle.viewModelScope
import com.example.kabadiwalebhaiiya.model.ProductData
import com.example.kabadiwalebhaiiya.network.ProductsApi
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException

/**
* UI state for the Home screen
*/
sealed interface ProductsUiState {
  data class Success(val photos: String) : ProductsUiState
  object Error : ProductsUiState
  object Loading : ProductsUiState
}

class ProductsViewModel : ViewModel() {
  /** The mutable State that stores the status of the most recent request */
  var productsUiState: ProductsUiState by mutableStateOf(ProductsUiState.Loading)
    private set

  /**
  * Call getProductsDatas() on init so we can display status immediately.
  */
  init {
    getProductsDatas()
  }

  /**
  * Gets Products datas information from the Products Api Retrofit service and updates the
  * [ProductData] [List] [MutableList].
  */
  fun getProductsDatas() {
    viewModelScope.launch {
      productsUiState = ProductsUiState.Loading
      productsUiState = try {
        val listProductsResult = ProductsApi.retrofitService.getProducts()
        ProductsUiState.Success(
          "Success: ${listProducts.size} Products datas retrieved"
        )
      } catch (e: IOException) {
        ProductsUiState.Error
      } catch (e: HttpException) {
        ProductsUiState.Error
      }
    }
  }
}
