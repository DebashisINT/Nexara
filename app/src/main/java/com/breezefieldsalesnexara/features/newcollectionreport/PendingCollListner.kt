package com.breezefieldsalesnexara.features.newcollectionreport

import com.breezefieldsalesnexara.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}