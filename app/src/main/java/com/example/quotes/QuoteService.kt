package com.example.quotes

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.jetbrains.anko.doAsync
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class QuoteService {

    val TAG = "QuoteService"

    private val BASE_URL = "https://zenquotes.io/api"

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(QuoteService::class.java)

       /* val call = service.get
        call.enqueue(object : Callback<MoviesResponse> {
            override fun onResponse(call: Call<MoviesResponse>, response: Response<MoviesResponse>) {
                if (response.code() == 200) {
                    val movieResponse = response.body()!!
                    for( movie in movieResponse.moviesArr){
                        Log.v("MainActivity", movie.name)
                    }
                }
            }
            override fun onFailure(call: Call<MoviesResponse>, t: Throwable) {
            }
        })*/
    }
}


