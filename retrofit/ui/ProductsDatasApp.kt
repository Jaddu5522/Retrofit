package com.example.kabadiwalebhaiiya

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.kabadiwalebhaiiya.R
import com.example.kabadiwalebhaiiya.ui.screens.HomeScreen
import com.example.kabadiwalebhaiiya.ui.screens.ProductsViewModel

@Composable
fun ProductsDatasApp(modifier: Modifier = Modifier) {
  Scaffold(
    modifier = modifier.fillMaxSize(),
    topBar = { TopAppBar(title = { Text(stringResource(R.string.app_name))})}
  ) {
    Surface(
      modifier = Modifier
            .fillMaxSize()
            .padding(it),
        color = MaterialTheme.colors.background
    ){
      val productsViewModel: ProductsViewModel = viewModel(factory = ProductsViewModel.Factory)
      HomeScreen(
        productsUiState = productsViewModel.productsUiState,
        retryAction = productsViewModel::getProductsDatas
      )
    }
  }
}
