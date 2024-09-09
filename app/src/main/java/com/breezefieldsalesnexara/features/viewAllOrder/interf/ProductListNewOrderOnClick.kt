package com.breezefieldsalesnexara.features.viewAllOrder.interf

import com.breezefieldsalesnexara.app.domain.NewOrderGenderEntity
import com.breezefieldsalesnexara.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}