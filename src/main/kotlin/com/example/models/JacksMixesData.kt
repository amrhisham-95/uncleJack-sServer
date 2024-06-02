package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class JacksMixesData(
    val id : Int,
    val Name : String,
    val Type : String,
    val Price : String,
    val Image : String
)


@Serializable
data class JacksMixesDataPosting(
    val id : Int,
    val Name : String,
    val Type : String,
    val Price : String,
    val Image : String
)