package com.ubertob.swapi

import org.http4k.core.HttpHandler
import org.http4k.core.Method
import org.http4k.core.Request


data class SwapiClient(val httpClient: HttpHandler) {

    fun people(id: Int): Person = httpClient(Request(Method.GET, "/people/$id/")).let {
        response ->
        val json = response.bodyString()
        println(json)
        Person("Luke")
//        JPerson.fromJson(json).orThrow()

    }

    fun starships(id: Int): Starship = httpClient(Request(Method.GET, "/starships/$id/")).let {
            response ->
        println(response.bodyString())
        Starship(id)
    }
}