package com.breezefieldsalesnexara.features.report.model

import com.breezefieldsalesnexara.base.BaseResponse
import com.breezefieldsalesnexara.features.nearbyshops.model.ShopData

/**
 * Created by Pratishruti on 27-12-2017.
 */
class MISResponse:BaseResponse() {
    var shop_list:List<ShopData>? = null
    var shop_list_count:MISShopListCount?=null
}