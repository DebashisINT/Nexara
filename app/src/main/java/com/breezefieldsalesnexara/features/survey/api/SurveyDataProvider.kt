package com.breezefieldsalesnexara.features.survey.api

import com.breezefieldsalesnexara.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldsalesnexara.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}