package com.example.cleanarchcryptocurrapp.presentation.coin_detail

import com.example.cleanarchcryptocurrapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
