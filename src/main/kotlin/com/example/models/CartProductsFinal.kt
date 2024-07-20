package com.example.models

import kotlinx.serialization.Serializable


@Serializable
data class CartProductsFinal(
    val itemPicFinal: String,
    val itemNameFinal: String,
    val itemPriceFinal:String,
    val itemTypeFinal :String,
    val itemQuantityFinal :String,
    val timeDate: String,
    val namePerson: String,
    val telephonePerson:String,
    val emailPerson :String
)


@Serializable
data class CartProductsFinalPosting(
    val itemPicFinal: String,
    val itemNameFinal: String,
    val itemPriceFinal:String,
    val itemTypeFinal :String,
    val itemQuantityFinal :String,
    val timeDate: String,
    val namePerson: String,
    val telephonePerson:String,
    val emailPerson :String
)
