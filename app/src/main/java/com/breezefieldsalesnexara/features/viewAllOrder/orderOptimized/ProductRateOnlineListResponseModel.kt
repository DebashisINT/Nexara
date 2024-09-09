package com.breezefieldsalesnexara.features.viewAllOrder.orderOptimized

import com.breezefieldsalesnexara.app.domain.ProductOnlineRateTempEntity
import com.breezefieldsalesnexara.base.BaseResponse
import com.breezefieldsalesnexara.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}