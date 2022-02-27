package com.inifnity.paralleapiswithcoroutinesandhof

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.activityViewModels

class MainActivity : AppCompatActivity() {

    val viewModel : ViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         viewModel.doSomeApiCalls()
    }
}