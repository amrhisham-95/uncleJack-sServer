package com.example.models

import kotlinx.serialization.Serializable


@Serializable
data class FruitsResponse<T>(
    val data : T,
    val success : Boolean
)
