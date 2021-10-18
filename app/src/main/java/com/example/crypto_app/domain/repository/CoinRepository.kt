package com.example.crypto_app.domain.repository

import com.example.crypto_app.data.remote.dto.CoinDetailDto
import com.example.crypto_app.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}