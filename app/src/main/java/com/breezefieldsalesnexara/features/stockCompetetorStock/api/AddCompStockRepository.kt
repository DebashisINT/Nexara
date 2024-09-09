package com.breezefieldsalesnexara.features.stockCompetetorStock.api

import com.breezefieldsalesnexara.base.BaseResponse
import com.breezefieldsalesnexara.features.orderList.model.NewOrderListResponseModel
import com.breezefieldsalesnexara.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldsalesnexara.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}