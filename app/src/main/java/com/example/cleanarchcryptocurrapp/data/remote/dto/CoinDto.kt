package com.example.cleanarchcryptocurrapp.data.remote.dto

import com.example.cleanarchcryptocurrapp.domain.model.Coin

//The below variables are created from JSON file.
data class CoinDto(
    val id: String,
    val is_active: Boolean,
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

//Only the below variables will be using in the module hence we transform required fields as below.
fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = is_active,
        name = name,
        rank = rank,
        symbol = symbol
    )
}

