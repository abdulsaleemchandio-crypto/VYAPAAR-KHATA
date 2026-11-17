package com.vyapaar.khata.data

object AccountingRules {
 fun total(quantity: Double, unitPrice: Double): Double = quantity * unitPrice
 fun toBaseCurrency(amount: Double, exchangeRateToBase: Double): Double {
  require(exchangeRateToBase > 0.0)
  return amount * exchangeRateToBase
 }
 fun grossProfit(salesBase: Double, costOfGoodsSoldBase: Double): Double = salesBase - costOfGoodsSoldBase
}
