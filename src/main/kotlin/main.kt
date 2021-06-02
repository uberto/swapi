import com.ubertob.swapi.SwapiClient
import org.http4k.client.JettyClient
import org.http4k.core.Uri
import org.http4k.core.then
import org.http4k.filter.ClientFilters

fun main() {

    val httpClient = ClientFilters.SetBaseUriFrom(Uri.of("https://swapi.dev/api")).then(JettyClient())

    val swapiClient = SwapiClient(httpClient)

    println("In a galaxy far, far away...")

    println(swapiClient.people(1))
//    println(swapiClient.starships(12))

    System.exit(0)
}