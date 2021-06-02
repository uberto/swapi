package com.ubertob.swapi

import com.ubertob.kondor.json.jsonnode.JsonNodeObject
import com.ubertob.kondor.json.*
import com.ubertob.kondor.json.datetime.JInstant
import com.ubertob.kondor.json.datetime.str
import com.ubertob.swapi.Person
//
//object JPerson : JAny<Person>() {
//    private val birth_year by str(Person::birth_year)
//
//    private val created by str( Person::created)
//
//    private val edited by str( Person::edited)
//
//    private val eye_color by str(Person::eye_color)
//
//    private val films by array(JString, Person::films)
//
//    private val gender by str(Person::gender)
//
//    private val hair_color by str(Person::hair_color)
//
//    private val height by str(Person::height)
//
//    private val homeworld by str(Person::homeworld)
//
//    private val mass by str(Person::mass)
//
//    private val name by str(Person::name)
//
//    private val skin_color by str(Person::skin_color)
//
//    private val species by array(JString, Person::species)
//
//    private val starships by array(JString, Person::starships)
//
//    private val url by str(Person::url)
//
//    private val vehicles by array(JString, Person::vehicles)
//
//    override fun JsonNodeObject.deserializeOrThrow(): Person =
//        Person(
//            birth_year = +birth_year,
//            created = +created,
//            edited = +edited,
//            eye_color = +eye_color,
//            films = +films,
//            gender = +gender,
//            hair_color = +hair_color,
//            height = +height,
//            homeworld = +homeworld,
//            mass = +mass,
//            name = +name,
//            skin_color = +skin_color,
//            species = +species,
//            starships = +starships,
//            url = +url,
//            vehicles = +vehicles
//        )
//}
