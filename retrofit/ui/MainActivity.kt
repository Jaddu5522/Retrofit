package com.example.kabadiwalebhaiiya

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.kabadiwalebhaiiya.ui.ProductsDatasApp
import com.example.kabadiwalebhaiiya.ui.theme.KabadiWaleBhaiiyaTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle) {
    enableEdgeToEdge()
    super.onCreate(savedInstanceState)
    setContent {
      KabadiWaleBhaiiyaTheme {
        Surface(
          modifier = Modifier.fillMaxSize(),
        ) {
          ProductsDatasApp()
        }
      }
    }
  }
}
