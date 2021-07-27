package com.example.chatapp.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.chatapp.data.Quote

class FakeQuoteDAO {
    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()
    init {
        quotes.value = quoteList
    }
    fun addQuote(quote: Quote){
        quoteList.add(quote)
        quotes.value = quoteList
    }
    fun getQuote() = quotes as LiveData<List<Quote>>


}