package com.breezefieldsalesnexara.features.stock.model

import com.breezefieldsalesnexara.base.BaseResponse


/**
 * Created by Saikat on 17-09-2019.
 */
class NewStockListResponseModel : BaseResponse() {
    var stock_list: ArrayList<StockListDataModel>? = null
}