package Tarea2_EstructurasArreglosYCiclos

//created by: 2CV22 HERNANDEZ GONZALEZ JOSEPH FABRIZZIO
fun calcularTarifa(kilometros: Double, aplicarDescuento: String?): Int {
    val tarifaBase = 2.25
    var total = tarifaBase * kilometros
    if (aplicarDescuento?.lowercase() == "si" || aplicarDescuento == "1") {
        total *= 0.55 // Aplicar descuento del 45%
    }
    return total.toInt() // Redondear a números enteros
}

fun main() {
    println("Kilómetros del trayecto:")
    val kilometros = readLine()?.toDoubleOrNull() ?: 0.0
    if (kilometros == 0.0) {
        println("Se deben ingresar los kilómetros del trayecto")
        return
    }

    println("Aplicar descuento (si/no):")
    val aplicarDescuento = readLine()

    val total = calcularTarifa(kilometros, aplicarDescuento)
    println("Total a cobrar: $ $total")
}
