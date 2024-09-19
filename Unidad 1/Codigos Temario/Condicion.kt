fun main() {

    //2CV22 HERNANDEZ GONZALEZ JOSEPH FABRIZZIO
    // 1. IF-ELSE SIMPLE Y ANIDADO
    val calificacion = 85
    if (calificacion >= 90) {
        println("Excelente")
    } else if (calificacion >= 80) {
        println("Muy bien")
    } else if (calificacion >= 70) {
        println("Bien")
    } else {
        println("Necesitas mejorar")
    }

    // 2. IF COMO EXPRESIÓN
    val edad = 16
    val puedeConducir = if (edad >= 18) "Sí" else "No"
    println("¿Puede conducir? $puedeConducir")

    // 3. EXPRESIÓN WHEN (Reemplazo de switch-case)
    val mes = 8
    val nombreMes = when (mes) {
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        else -> "Mes desconocido"
    }
    println("El mes es: $nombreMes")

    // 4. WHEN CON VARIOS CASOS
    val diaSemana = 2
    when (diaSemana) {
        1, 7 -> println("Fin de semana")
        in 2..6 -> println("Día laboral")
        else -> println("Día no válido")
    }

    // 5. WHEN COMO EXPRESIÓN CON RETORNOS
    val esPar = when {
        edad % 2 == 0 -> "Sí, es par"
        else -> "No, es impar"
    }
    println("¿La edad es par? $esPar")

    // 6. USO DE `when` CON TIPOS
    val objeto: Any = 42
    when (objeto) {
        is String -> println("Es una cadena de texto")
        is Int -> println("Es un número entero")
        else -> println("Es de un tipo desconocido")
    }

    // 7. EVALUACIÓN LÓGICA CON IF-ELSE
    val edadMayor = 65
    val resultado = if (edadMayor >= 65 && edadMayor < 75) {
        "Senior joven"
    } else if (edadMayor >= 75) {
        "Senior mayor"
    } else {
        "No es senior"
    }
    println("Clasificación de edad: $resultado")
}
