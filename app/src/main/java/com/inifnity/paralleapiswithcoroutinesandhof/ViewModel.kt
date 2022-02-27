package com.inifnity.paralleapiswithcoroutinesandhof

import android.util.Log
import androidx.lifecycle.ViewModel

class ViewModel :ViewModel(){


    val repository: Repository= Repository()



    fun doSomeApiCalls() {
        repository.returnSomeItems { humans, animals ->


            Log.e("humans", "$humans")

            Log.e("Animals", "$animals")

        }
    }
}