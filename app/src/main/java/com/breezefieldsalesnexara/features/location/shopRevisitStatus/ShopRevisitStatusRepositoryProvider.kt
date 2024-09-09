package com.breezefieldsalesnexara.features.location.shopRevisitStatus

import com.breezefieldsalesnexara.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalesnexara.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}