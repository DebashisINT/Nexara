package com.breezefieldsalesnexara.features.viewAllOrder.interf

import com.breezefieldsalesnexara.app.domain.NewOrderColorEntity
import com.breezefieldsalesnexara.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}