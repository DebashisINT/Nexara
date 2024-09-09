package com.breezefieldsalesnexara.features.location.api

import com.breezefieldsalesnexara.app.Pref
import com.breezefieldsalesnexara.base.BaseResponse
import com.breezefieldsalesnexara.features.location.model.AppInfoInputModel
import com.breezefieldsalesnexara.features.location.model.AppInfoResponseModel
import com.breezefieldsalesnexara.features.location.model.GpsNetInputModel
import com.breezefieldsalesnexara.features.location.model.ShopDurationRequest
import com.breezefieldsalesnexara.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }

    fun gpsNetInfo(appInfo: GpsNetInputModel?): Observable<BaseResponse> {
        return apiService.submitGpsNetInfo(appInfo)
    }
}