package com.example.quotes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Quote(

    @SerializedName("q")
    @Expose
    val quoteText: String? = "",

    @SerializedName("a")
    @Expose
    val author: String? = "")