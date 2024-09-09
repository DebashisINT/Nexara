package com.breezefieldsalesnexara.features.lead.api

import com.breezefieldsalesnexara.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldsalesnexara.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}