package com.example.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.quotes.databinding.ActivityMainBinding

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var quoteViewModel : QuoteViewModel
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        quoteViewModel = ViewModelProvider(this).get(QuoteViewModel::class.java)
        mainBinding.viewmodel = quoteViewModel

        observeQuote()
    }

    fun observeQuote() {
       quoteViewModel.quote.observe(this, Observer {quote ->
            Toast.makeText(this, quote.quoteText, Toast.LENGTH_LONG).show()
        })
    }
}
