package com.ubertob.swapi

import com.ubertob.kondortools.generateConverterFileFor


fun main(){
    println(generateConverterFileFor(Person::class, Starship::class))
}