package com.example.chatapp.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.chatapp.data.Quote
import com.example.chatapp.data.QuoteRepository

class QuoteViewModel(private val quoteRepository: QuoteRepository): ViewModel() {
    fun getQuote() = quoteRepository.getQuote()
    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}