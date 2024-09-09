package com.breezefieldsalesnexara.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldsalesnexara.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldsalesnexara.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}