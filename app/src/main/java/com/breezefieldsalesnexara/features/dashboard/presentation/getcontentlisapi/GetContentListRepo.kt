package com.breezefieldsalesnexara.features.dashboard.presentation.getcontentlisapi

import com.breezefieldsalesnexara.app.Pref
import com.breezefieldsalesnexara.base.BaseResponse
import com.breezefieldsalesnexara.features.dashboard.presentation.model.ContentListResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 05-03-2019.
 */
class GetContentListRepo(val apiService: GetContentListApi) {
    fun getContentList(): Observable<ContentListResponseModel> {
        return apiService.getContentList(Pref.session_token!!)
    }

    fun changePassword(old_pwd: String, new_pwd: String): Observable<BaseResponse> {
        return apiService.changePassword(Pref.session_token!!, Pref.user_id!!, old_pwd, new_pwd)
    }
}