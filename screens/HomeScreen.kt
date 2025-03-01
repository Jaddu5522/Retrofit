package com.example.kabadiwalebhaiiya.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kabadiwalebhaiiya.R
import com.example.kabadiwalebhaiiya.ui.theme.KabadiWaleBhaiiyaTheme

@Composable
fun HomeScreen(
  productsUiState: ProductsUiState,
  modifier: Modifier = Modifier,
  contentPadding: PaddingValues = PaddingValues(0.dp)
) {
  when (productsUiState) {
    is ProductsUiState.Loading -> LoadingScreen(modifier = modifier.fillMaxSize())
    is ProductsUiState.Success -> ResultScreen(
      productsUiState.productsDatas, modifier = modifier.fillMaxWidth()
    )
    is ProductsUiState.Error -> ErrorScreen( modifier = modifier.fillMaxSize())
  }
}

/** 
* The home screen displaying the loading message.
*/
@Composable
fun LoadingScreen(modifier: Modifier = Modifier) {
  Image(
    modifier = modifier.size(200.dp),
    painter = painterResource(R.drawable.loading_img),
    contentDescription = stringResource(R.string.loading)
  )
}

/**
* The home screen displaying error message with re-attempt button.
*/
@Composable
fun ErrorScreen(modifier: Modifier = Modifier) {
  Column(
    modifier = modifier,
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Image(
      painter = painterResource(id = R.drawable.ic_connection_error),
      contentDescription = ""
    )
    Text(
      text = stringResource(R.string.loading_failed),
      modifier = Modifier.padding(16.dp)
    )
  }
}

@Composable
fun ResultScreen(images: String, Modifier = Modifier) {
  Box(
    contentAlignment = Alignment.Center,
    modifier = modifier
  ) {
    Text(text = images)
  }
}

@Preview(showBackground = true)
@Composable
fun LoadingScreenPreview() {
  KabadiWaleBhaiiyaTheme {
    LoadingScreen()
  }
}

@Preview(showBackground = true)
@Composable
fun ErrorScreenPreview() {
  KabadiWaleBhaiiyaTheme {
    ErrorScreen()
  }
}

@Preview()
@Composable
fun PhotosGridScreenPreview() {
  KabadiWaleBhaiiyaTheme {
    ResultScreen(stringResource(R.string.placeholder_success))
  }
}
