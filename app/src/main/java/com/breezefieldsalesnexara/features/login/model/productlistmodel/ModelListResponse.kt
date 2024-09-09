package com.breezefieldsalesnexara.features.login.model.productlistmodel

import com.breezefieldsalesnexara.app.domain.ModelEntity
import com.breezefieldsalesnexara.app.domain.ProductListEntity
import com.breezefieldsalesnexara.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}