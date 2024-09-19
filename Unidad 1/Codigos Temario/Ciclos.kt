fun main() {
    //2CV22 HERNANDEZ GONZALEZ JOSEPH FABRIZZIO
    // 1. Ciclo for básico con rango
    println("Ciclo for con rango:")
    for (i in 1..5) {
        println("Valor de i: $i")
    }

    // 2. Ciclo for iterando sobre una lista
    println("\nCiclo for iterando sobre una lista:")
    val lenguajes = listOf("Kotlin", "Java", "Python")
    for (lenguaje in lenguajes) {
        println("Lenguaje: $lenguaje")
    }

    // 3. Ciclo for con índices
    println("\nCiclo for con índices:")
    for (i in lenguajes.indices) {
        println("Indice: $i, Lenguaje: ${lenguajes[i]}")
    }

    // 4. Ciclo for con step
    println("\nCiclo for con step:")
    for (i in 1..10 step 2) {
        println("Valor con step de 2: $i")
    }

    // 5. Ciclo for con downTo (decrementando)
    println("\nCiclo for con downTo:")
    for (i in 5 downTo 1) {
        println("Valor decrementado: $i")
    }

    // 6. Ciclo for con until (excluye el último valor)
    println("\nCiclo for con until:")
    for (i in 1 until 5) {
        println("Valor de i (sin incluir 5): $i")
    }

    // 7. Ciclo for con condicional dentro
    println("\nCiclo for con condicional:")
    for (i in 1..10) {
        if (i % 2 == 0) {
            println("Número par: $i")
        } else {
            println("Número impar: $i")
        }
    }

    // 8. Ciclo while
    println("\nCiclo while:")
    var contador = 1
    while (contador <= 5) {
        println("Contador en while: $contador")
        contador++
    }

    // 9. Ciclo do-while
    println("\nCiclo do-while:")
    var contador2 = 1
    do {
        println("Contador en do-while: $contador2")
        contador2++
    } while (contador2 <= 5)

    // 10. Ciclo con break
    println("\nCiclo for con break:")
    for (i in 1..10) {
        if (i == 5) {
            println("Se rompe el ciclo en: $i")
            break
        }
        println("Valor de i: $i")
    }

    // 11. Ciclo con continue
    println("\nCiclo for con continue:")
    for (i in 1..5) {
        if (i == 3) {
            println("Se salta el valor: $i")
            continue
        }
        println("Valor de i: $i")
    }

    // 12. Ciclo forEach (con lambdas)
    println("\nCiclo forEach:")
    lenguajes.forEach { lenguaje ->
        println("Lenguaje con forEach: $lenguaje")
    }

    // 13. Ciclo forEach con índices
    println("\nCiclo forEach con índices:")
    lenguajes.forEachIndexed { index, lenguaje ->
        println("Índice: $index, Lenguaje: $lenguaje")
    }

    // 14. Ciclo anidado
    println("\nCiclo for anidado:")
    for (i in 1..3) {
        for (j in 1..3) {
            println("Valor de i: $i, Valor de j: $j")
        }
    }
}
