package com.breezefieldsalesnexara.features.stockAddCurrentStock.api

import com.breezefieldsalesnexara.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsalesnexara.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}