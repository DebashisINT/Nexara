package com.breezefieldsalesnexara.features.viewAllOrder.interf

import com.breezefieldsalesnexara.app.domain.NewOrderProductEntity
import com.breezefieldsalesnexara.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}