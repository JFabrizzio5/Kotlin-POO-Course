// Created by: 2CV22 HERNANDEZ GONZALEZ JOSEPH FABRIZZIO
fun calculateFare(kilometers: Double, applyDiscount: String?): Int {
    val baseFare = 2.25
    var total = baseFare * kilometers
    if (applyDiscount?.lowercase() == "si" || applyDiscount == "1") {
        total *= 0.55 // Aplicar descuento del 45%
    }
    return total.toInt() // Redondear a números enteros
}

fun main() {
    while (true) {
        println("Kilómetros del trayecto (o escribe 'SALIR' para salir):")
        val input = readLine()

        // Comprobar si el usuario quiere salir
        if (input.equals("SALIR", ignoreCase = true)) {
            println("Saliendo del programa...")
            break
        }

        val kilometers = input?.toDoubleOrNull()
        if (kilometers == null || kilometers <= 0) {
            println("Se deben ingresar los kilómetros del trayecto")
            continue // Volver al inicio del bucle
        }

        println("Aplicar descuento (si/no):")
        val applyDiscount = readLine()

        val total = calculateFare(kilometers, applyDiscount)
        println("Total a cobrar: $ $total")
    }
}
