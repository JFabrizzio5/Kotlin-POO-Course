// Created by: JFabrizzio5

fun main() {
    println("Introduce tu calle:")
    val street = readLine() ?: ""

    println("Introduce tu ciudad:")
    val city = readLine() ?: ""

    println("Introduce tu estado o provincia:")
    val state = readLine() ?: ""

    println("Introduce tu país:")
    val country = readLine() ?: ""

    println("Introduce tu código postal:")
    val postalCode = readLine() ?: ""

    println("$street, $city, $state, $country, $postalCode")
}
