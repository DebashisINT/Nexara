package com.breezefieldsalesnexara.features.mylearning.apiCall

import com.breezefieldsalesnexara.features.login.api.opportunity.OpportunityListApi
import com.breezefieldsalesnexara.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}