package com.breezefieldsalesnexara.features.location.shopRevisitStatus

import com.breezefieldsalesnexara.base.BaseResponse
import com.breezefieldsalesnexara.features.location.model.ShopDurationRequest
import com.breezefieldsalesnexara.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}