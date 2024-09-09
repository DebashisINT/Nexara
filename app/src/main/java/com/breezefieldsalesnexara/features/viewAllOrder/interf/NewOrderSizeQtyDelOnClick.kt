package com.breezefieldsalesnexara.features.viewAllOrder.interf

import com.breezefieldsalesnexara.app.domain.NewOrderGenderEntity
import com.breezefieldsalesnexara.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}