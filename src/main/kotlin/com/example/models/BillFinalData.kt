package com.example.models

import kotlinx.serialization.Serializable


@Serializable
data class BillFinalData(
    val id : Int,
    val totalPrice : String,
    val deliveryFee : String,
    val serviceFee : String,
    val vat : String,
    val totalFinalPrice : String,
    val longitude : String,
    val latitude : String,
    val phoneNumber : String,
    val namePerson : String,
    val emailPerson : String,
    val timeDate : String
)


@Serializable
data class BillFinalDataPosting(
    val id : Int,
    val totalPrice : String,
    val deliveryFee : String,
    val serviceFee : String,
    val vat : String,
    val totalFinalPrice : String,
    val longitude : String,
    val latitude : String,
    val phoneNumber : String,
    val namePerson : String,
    val emailPerson : String,
    val timeDate : String
)