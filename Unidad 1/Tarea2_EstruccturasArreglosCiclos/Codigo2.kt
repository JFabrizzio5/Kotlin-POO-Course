package Tarea2_EstructurasArreglosYCiclos

//created by: 2CV22 HERNANDEZ GONZALEZ JOSEPH FABRIZZIO
fun calcularPromedio(calificaciones: Array<Double>): Double {
    return calificaciones.average()
}

fun calificacionMasAlta(calificaciones: Array<Double>): Double {
    return calificaciones.maxOrNull() ?: 0.0
}

fun calificacionMasBaja(calificaciones: Array<Double>): Double {
    return calificaciones.minOrNull() ?: 0.0
}

fun reprobados(alumnos: Array<String>, calificaciones: Array<Double>): List<Pair<String, Double>> {
    return alumnos.zip(calificaciones).filter { it.second < 60.0 }
}

fun main() {
    val alumnos = arrayOf("José", "Alberto", "Laura", "Noel", "Erika", "Daniel")
    val calificaciones = arrayOf(31.0, 94.0, 98.5, 75.0, 46.5, 75.0)

    val promedio = calcularPromedio(calificaciones)
    val maxCalificacion = calificacionMasAlta(calificaciones)
    val minCalificacion = calificacionMasBaja(calificaciones)
    val alumnosReprobados = reprobados(alumnos, calificaciones)

    println("Promedio de calificación: $promedio")
    println("Calificación más alta: $maxCalificacion")
    println("Calificación más baja: $minCalificacion")

    println("Reprobados:")
    for ((alumno, calificacion) in alumnosReprobados) {
        println("$alumno, $calificacion")
    }
}
