package com.breezefieldsalesnexara.features.weather.api

import com.breezefieldsalesnexara.features.task.api.TaskApi
import com.breezefieldsalesnexara.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}