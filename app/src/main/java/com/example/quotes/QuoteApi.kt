package com.example.quotes

import com.example.quotes.model.Quote
import retrofit2.http.GET


interface QuoteApi {

    @GET("/api/random.json")
    fun getQuote(): Quote
}