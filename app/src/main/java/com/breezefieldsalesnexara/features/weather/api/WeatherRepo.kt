package com.breezefieldsalesnexara.features.weather.api

import com.breezefieldsalesnexara.base.BaseResponse
import com.breezefieldsalesnexara.features.task.api.TaskApi
import com.breezefieldsalesnexara.features.task.model.AddTaskInputModel
import com.breezefieldsalesnexara.features.weather.model.ForeCastAPIResponse
import com.breezefieldsalesnexara.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}