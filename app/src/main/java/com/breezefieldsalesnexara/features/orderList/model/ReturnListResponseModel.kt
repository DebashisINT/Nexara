package com.breezefieldsalesnexara.features.orderList.model

import com.breezefieldsalesnexara.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}