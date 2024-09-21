fun main() {
    triangulo1()
    println()
    triangulo2() // Corregido
    println()
    triangulo3()
    println()
    triangulo4()
    println()
    rombo()
    println()
    arbol()
}

// Triángulo 1
fun triangulo1() {
    println("=== Triángulo 1 ===")

    val n = 8 // Número de líneas del triángulo

    for (i in 1..n) {
        // Imprimir espacios en blanco
        for (j in 1..(n - i)) {
            print(" ")
        }
        // Imprimir asteriscos
        for (k in 1..i) {
            print("*")
        }
        println()
    }

}

// Triángulo 2 (nuevo, como el triángulo 1 original)
fun triangulo2() {
    println("=== Triángulo 2 ===")
    for (i in 1..8) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}


// Triángulo 3 (invertido y alineado a la derecha)
fun triangulo3() {
    println("=== Triángulo 3 ===")
    for (i in 8 downTo 1) {
        for (j in 1..8 - i) {
            print(" ")
        }
        for (k in 1..i) {
            print("*")
        }
        println()
    }
}

// Triángulo 4 (invertido)
fun triangulo4() {
    println("=== Triángulo 4 ===")
    for (i in 8 downTo 1) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}

// Rombo
fun rombo() {
    println("=== Rombo ===")
    for (i in 1..4) {
        for (j in 1..4 - i) {
            print(" ")
        }
        for (k in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }
    for (i in 3 downTo 1) {
        for (j in 1..4 - i) {
            print(" ")
        }
        for (k in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }
}

// Árbol
fun arbol() {
    println("=== Árbol ===")
    for (i in 1..4) {
        for (j in 1..4 - i) {
            print(" ")
        }
        for (k in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }
    for (i in 1..2) {
        println("   ||")
    }
}