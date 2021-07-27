package com.example.chatapp.data

class QuoteRepository private constructor(private val quoteDAO: FakeQuoteDAO) {
    fun addQuote(quote: Quote){
        quoteDAO.addQuote(quote)
    }
    fun getQuote() = quoteDAO.getQuote()
    companion object{
        @Volatile private var instace: QuoteRepository? = null
        fun getInstance(quoteDAO: FakeQuoteDAO) = instace?: synchronized(this){
            instace ?: QuoteRepository(quoteDAO).also { instace = it }
        }

    }
}