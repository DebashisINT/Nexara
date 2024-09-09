package com.breezefieldsalesnexara.features.location.api

import com.breezefieldsalesnexara.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalesnexara.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}