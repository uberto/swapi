package com.ubertob.swapi

import com.ubertob.kondor.json.*
import com.ubertob.kondor.json.jsonnode.JsonNodeObject
import java.net.URL

object JUrl : JStringRepresentable<URL>() {
    override val cons: (String) -> URL = ::URL
    override val render: (URL) -> String = URL::toString
}

@JvmName("bindURL")
fun <PT : Any> str(binder: PT.() -> URL) = JField(binder, JUrl)


