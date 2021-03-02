package com.example.quotes.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.quotes.model.Quote

class QuoteViewModel : ViewModel() {

    val quote  = MutableLiveData<Quote>()

    val loadingError = MutableLiveData<Boolean>()

    val isLoading = MutableLiveData<Boolean>()

    fun fetchQuote() {
        val mockData : Quote = Quote("Never confuse a single defeat with a final defeat.", "F. Scott Fitzgerald")

        loadingError.value = false
        isLoading.value = false
        quote.value = mockData
    }
}