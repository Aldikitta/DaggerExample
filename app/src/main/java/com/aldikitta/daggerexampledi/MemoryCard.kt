package com.aldikitta.daggerexampledi

import android.util.Log
import javax.inject.Inject


// pretend this class is from third party library so we cannot add injection constructor to it
class MemoryCard {
    init {
        Log.i("MYTAG","Memory Card Constructed")
    }

    fun getSpaceAvailablity(){
        Log.i("MYTAG","Memory space available")
    }
}