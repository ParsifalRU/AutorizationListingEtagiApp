package com.example.autorizationlistingetagiapp.network.models

import android.os.Parcel
import android.os.Parcelable

data class NetworkModel(

val date: String?,
val explanation: String?,
val url: String?,
val media_type: String?,
val hdurl: String?,
val image: String?,
val service_version: String?,
val title: String?

):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(date)
        parcel.writeString(explanation)
        parcel.writeString(url)
        parcel.writeString(media_type)
        parcel.writeString(hdurl)
        parcel.writeString(image)
        parcel.writeString(service_version)
        parcel.writeString(title)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<NetworkModel> {
        override fun createFromParcel(parcel: Parcel): NetworkModel {
            return NetworkModel(parcel)
        }

        override fun newArray(size: Int): Array<NetworkModel?> {
            return arrayOfNulls(size)
        }
    }
}

