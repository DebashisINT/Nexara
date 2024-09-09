package com.breezefieldsalesnexara.features.viewAllOrder.model

import com.breezefieldsalesnexara.app.domain.NewOrderColorEntity
import com.breezefieldsalesnexara.app.domain.NewOrderGenderEntity
import com.breezefieldsalesnexara.app.domain.NewOrderProductEntity
import com.breezefieldsalesnexara.app.domain.NewOrderSizeEntity
import com.breezefieldsalesnexara.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

