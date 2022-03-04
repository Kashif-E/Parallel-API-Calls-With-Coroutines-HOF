package com.inifnity.paralleapiswithcoroutinesandhof

import android.util.Log
import androidx.lifecycle.ViewModel

class ViewModel :ViewModel(){


    val repository: Repository= Repository()



    fun doSomeApiCalls() {

        repository.returnSomeItems{human, animal ->

            Log.e("humans", human.toString())
            Log.e("animals", animal.toString())
        }
    }
}