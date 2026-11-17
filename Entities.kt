package com.vyapaar.khata.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "currencies")
data class CurrencyEntity(@PrimaryKey val code: String, val displayName: String, val symbol: String, val isBase: Boolean = false)

@Entity(tableName = "transactions")
data class TransactionEntity(
 @PrimaryKey(autoGenerate = true) val id: Long = 0,
 val type: String,
 val itemName: String?,
 val quantity: Double,
 val unit: String,
 val unitPrice: Double,
 val currencyCode: String,
 val exchangeRateToBase: Double,
 val totalInTransactionCurrency: Double,
 val totalInBaseCurrency: Double,
 val createdAtMillis: Long,
 val note: String?
)

@Entity(tableName = "products")
data class ProductEntity(
 @PrimaryKey(autoGenerate = true) val id: Long = 0,
 val name: String,
 val category: String?,
 val unit: String,
 val quantityOnHand: Double,
 val averageCostBaseCurrency: Double
)
