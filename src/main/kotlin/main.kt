import com.ubertob.swapi.SwapiClient
import org.http4k.client.JettyClient
import org.http4k.core.Uri
import org.http4k.core.then
import org.http4k.filter.ClientFilters

fun main() {

    val httpClient = ClientFilters.SetBaseUriFrom(Uri.of("https://swapi.dev/api")).then(JettyClient())

    val swapiClient = SwapiClient(httpClient)

    println("Hello World!")

    println(swapiClient.people(1))

    System.exit(0)
}