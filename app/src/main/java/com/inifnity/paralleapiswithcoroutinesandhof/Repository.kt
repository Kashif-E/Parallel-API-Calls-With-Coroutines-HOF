package com.inifnity.paralleapiswithcoroutinesandhof

import android.util.Log
import kotlinx.coroutines.*

class Repository {


    fun returnSomeItems(returnData:(humans: List<Human>, animals: List<Animal>)-> Unit ){
        CoroutineScope(Dispatchers.IO).launch {
             val animal = async {
                 Log.e("calling ", "get animals")
                 getAnimals()
             }
            val  humans= async {
                Log.e("calling ", "get humans")
                getHumans()
            }

            val humanResponse = humans.await()

            val animalResponse = animal.await()

            returnData(
                humanResponse,
                animalResponse
            )


        }
    }

    suspend fun getHumans() : List<Human>{

        val list = mutableListOf<Human>()
        for (i in 1..10){

            list.add(
                Human(
                    "Putin",
                    "Russian"
                )
            )
        }
        delay(1000)
        Log.e("sending ", "get humans")
        return  list
    }

    suspend fun getAnimals(): List<Animal>{

        val list = mutableListOf<Animal>()
        for (i in 1..10){

            list.add(
                Animal(
                    "Bear",
                    "Vodka"
                )
            )
        }
        delay(3000)
        Log.e("sending ", "get animals")
        return  list
    }
}