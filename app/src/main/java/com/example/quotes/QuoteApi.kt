package com.example.quotes

import retrofit2.Call
import retrofit2.http.GET

interface QuoteApi {

    @GET("/random")
    fun getQuote(): Call<Quote>

    @GET("/quotes")
    fun getQuoteList(): Call<List<Quote>>
}