package com.example.chatapp.data

import kotlin.jvm.Volatile

class FakeDatabase private constructor() {
    companion object{
        @Volatile private var instance: FakeDatabase? = null
        fun getInstance() = instance?: synchronized(this){
            instance?: FakeDatabase().also { instance = it }
        }
    }
}