package com.example.crypto_app.presentation.coin_list

import com.example.crypto_app.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)

