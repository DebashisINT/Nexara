package com.breezefieldsalesnexara.features.activities.api

import com.breezefieldsalesnexara.features.member.api.TeamApi
import com.breezefieldsalesnexara.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}