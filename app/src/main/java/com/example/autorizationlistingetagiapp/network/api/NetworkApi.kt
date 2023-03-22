package com.example.autorizationlistingetagiapp.network.api

import com.example.autorizationlistingetagiapp.network.models.NetworkModel
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Single
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

private const val API_KEY = "TZIMZYEFae7yfl8BNaoYsogFD8e88WTx0dSaWvxi"
private const val PICTURE_OF_DAY = "planetary/apod"

val currentDate: Date = Date()
val dateFormat: DateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
val dateText: String = dateFormat.format(currentDate)


interface NetworkApi {

    @GET(PICTURE_OF_DAY)
    fun getPhotos(

        @Query("api_key")
        ApiKey: String = API_KEY,

        @Query("start_date")
        StartDate: String = dateText

    ): Single<List<NetworkModel>>
}