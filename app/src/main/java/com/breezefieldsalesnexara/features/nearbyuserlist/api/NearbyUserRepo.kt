package com.breezefieldsalesnexara.features.nearbyuserlist.api

import com.breezefieldsalesnexara.app.Pref
import com.breezefieldsalesnexara.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldsalesnexara.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldsalesnexara.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}