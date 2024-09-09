package com.breezefieldsalesnexara.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldsalesnexara.app.FileUtils
import com.breezefieldsalesnexara.app.Pref
import com.breezefieldsalesnexara.base.BaseResponse
import com.breezefieldsalesnexara.features.addshop.model.AddLogReqData
import com.breezefieldsalesnexara.features.addshop.model.AddShopRequestData
import com.breezefieldsalesnexara.features.addshop.model.AddShopResponse
import com.breezefieldsalesnexara.features.addshop.model.LogFileResponse
import com.breezefieldsalesnexara.features.addshop.model.UpdateAddrReq
import com.breezefieldsalesnexara.features.contacts.CallHisDtls
import com.breezefieldsalesnexara.features.contacts.CompanyReqData
import com.breezefieldsalesnexara.features.contacts.ContactMasterRes
import com.breezefieldsalesnexara.features.contacts.SourceMasterRes
import com.breezefieldsalesnexara.features.contacts.StageMasterRes
import com.breezefieldsalesnexara.features.contacts.StatusMasterRes
import com.breezefieldsalesnexara.features.contacts.TypeMasterRes
import com.breezefieldsalesnexara.features.dashboard.presentation.DashboardActivity
import com.breezefieldsalesnexara.features.login.model.WhatsappApiData
import com.breezefieldsalesnexara.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}