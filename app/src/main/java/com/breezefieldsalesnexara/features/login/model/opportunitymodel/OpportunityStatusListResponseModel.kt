package com.breezefieldsalesnexara.features.login.model.opportunitymodel

import com.breezefieldsalesnexara.app.domain.OpportunityStatusEntity
import com.breezefieldsalesnexara.app.domain.ProductListEntity
import com.breezefieldsalesnexara.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}