package com.example.cleanarchcryptocurrapp.domain.repository

import com.example.cleanarchcryptocurrapp.data.remote.dto.CoinDetailDto
import com.example.cleanarchcryptocurrapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}