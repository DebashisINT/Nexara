package com.breezefieldsalesnexara.features.viewAllOrder.interf

import com.breezefieldsalesnexara.app.domain.NewOrderGenderEntity
import com.breezefieldsalesnexara.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}