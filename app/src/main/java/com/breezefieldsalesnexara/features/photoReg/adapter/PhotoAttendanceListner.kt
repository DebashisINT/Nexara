package com.breezefieldsalesnexara.features.photoReg.adapter

import com.breezefieldsalesnexara.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}