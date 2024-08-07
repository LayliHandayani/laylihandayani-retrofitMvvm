package com.stmik.mvvmretrofit.model

import com.google.gson.annotations.SerializedName

data class Book(
    @SerializedName("title")
    val name: String,
    @SerializedName("desc")
    val description: String,
    @SerializedName("image")
    val photo: String
)