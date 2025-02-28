package com.example.kabadiwaebhaiiya.model

import kotlinx.serialization.SerialName
import kotlinx.serializable.Serializable

/**
* This data class defines a Product data which include, an ID, image, price, description etc
*/

@Serializable
data class ProductData(
  val id: Int,
  @SerialName(value = "name")
  val productName: String,
  val price: String,
  val image: String,
  val description: String,
  val category: String
)
