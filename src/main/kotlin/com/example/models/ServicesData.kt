package com.example.models


import kotlinx.serialization.Serializable

@Serializable
data class ServicesData(
    val id : Int,
    val Service : String,
    val Delivery : String,
    val VAT : String
)


@Serializable
data class ServicesDataPosting(
    val id : Int,
    val Service : String,
    val Delivery : String,
    val VAT : String
)
