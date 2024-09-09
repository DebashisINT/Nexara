package com.breezefieldsalesnexara.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefieldsalesnexara.app.FileUtils
import com.breezefieldsalesnexara.base.BaseResponse
import com.breezefieldsalesnexara.features.NewQuotation.model.*
import com.breezefieldsalesnexara.features.addshop.model.AddShopRequestData
import com.breezefieldsalesnexara.features.addshop.model.AddShopResponse
import com.breezefieldsalesnexara.features.damageProduct.model.DamageProductResponseModel
import com.breezefieldsalesnexara.features.damageProduct.model.delBreakageReq
import com.breezefieldsalesnexara.features.damageProduct.model.viewAllBreakageReq
import com.breezefieldsalesnexara.features.login.model.userconfig.UserConfigResponseModel
import com.breezefieldsalesnexara.features.myjobs.model.WIPImageSubmit
import com.breezefieldsalesnexara.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}