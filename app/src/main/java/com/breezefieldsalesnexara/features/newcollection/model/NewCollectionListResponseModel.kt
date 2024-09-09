package com.breezefieldsalesnexara.features.newcollection.model

import com.breezefieldsalesnexara.app.domain.CollectionDetailsEntity
import com.breezefieldsalesnexara.base.BaseResponse
import com.breezefieldsalesnexara.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}