package com.breezefieldsalesnexara.features.document.api

import com.breezefieldsalesnexara.features.dymanicSection.api.DynamicApi
import com.breezefieldsalesnexara.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}