package com.example.models

import kotlinx.serialization.Serializable

@Serializable

data class JuicesData(
    val id : Int,
    val Name : String,
    val Type : String,
    val Price : String,
    val Image : String
)


@Serializable

data class JuicesDataPosting(
    val id : Int,
    val Name : String,
    val Type : String,
    val Price : String,
    val Image : String
)
