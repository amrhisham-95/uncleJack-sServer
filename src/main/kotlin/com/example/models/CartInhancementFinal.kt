package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class CartInhancementFinal(
    val timeDate: String,
    val namePerson: String,
    val telephonePerson:String,
    val itemNameFinal :String,
    val itemPriceFinal :String,
    val itemTypeFinal:String,
    val itemQuantityFinal :String
)


@Serializable
data class CartInhancementFinalPosting(
    val timeDate: String,
    val namePerson: String,
    val telephonePerson:String,
    val itemNameFinal :String,
    val itemPriceFinal :String,
    val itemTypeFinal:String,
    val itemQuantityFinal :String
)
