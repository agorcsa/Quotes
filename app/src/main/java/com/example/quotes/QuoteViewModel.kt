package com.example.quotes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuoteViewModel : ViewModel() {

    private val quoteService = QuoteService()

    val quote  = MutableLiveData<Quote>()

    val loadingError = MutableLiveData<Boolean>()

    val isLoading = MutableLiveData<Boolean>()

    fun fetchQuote() {

    }
}