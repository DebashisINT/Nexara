package com.breezefieldsalesnexara.features.photoReg.present

import com.breezefieldsalesnexara.app.domain.ProspectEntity
import com.breezefieldsalesnexara.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}