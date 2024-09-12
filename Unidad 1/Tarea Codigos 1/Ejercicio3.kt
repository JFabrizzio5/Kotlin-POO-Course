// Created by: JFabrizzio5

const val PI = 3.1416

fun calculateArea(radius: Double): Double {
    return PI * radius * radius
}

fun calculateCircumference(radius: Double): Double {
    return 2 * PI * radius
}

fun convertToInches(value: Double): Double {
    return value / 2.54
}

fun main() {
    println("Introduce el radio del círculo en cm:")
    val radius = readLine()?.toDoubleOrNull() ?: 0.0

    val areaCm = calculateArea(radius)
    val circumferenceCm = calculateCircumference(radius)
    val areaIn = convertToInches(areaCm)
    val circumferenceIn = convertToInches(circumferenceCm)

    println("Área en cm²: ${"%.2f".format(areaCm)}, en pulgadas²: ${"%.2f".format(areaIn)}")
    println("Circunferencia en cm: ${"%.2f".format(circumferenceCm)}, en pulgadas: ${"%.2f".format(circumferenceIn)}")
}
