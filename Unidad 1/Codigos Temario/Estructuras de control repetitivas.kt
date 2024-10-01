fun main() {
    print("Estructuras de control repetititvas")
    println("While")
    var i = 1
    while (i <= 10) {
        print("$i ")
        i++
    }
    println("\nDo while")
    i = 1
    do {
        print("$i ")
        i++
    } while (i <= 10)

    println("\nfor")
    for (i in 1..10) {
        print("$i ")
    }
    println("\nfor con step")
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println("\nfor con downTo")
    for (i in 10 downTo 1) {
        print("$i ")
    }
    println("\nfor con downTo y step")
    for (i in 10 downTo 1 step 3) {
        print("$i ")
    }
    println("\nforEach")
    (1..10).forEach {
        print("$it ")
    }
    println("\nforEach renombrado")
    (1..10).forEach { numero ->
        print("$numero ")
    }
    println("\nfor each renombrado 2")
    val letras = "hola amigos como la ven"
    letras.forEach { letra ->
        print("$letra ")
    }
    println("\nArreglos")
    val nombres = arrayOf<String>("Hugo", "Paco", "Luis", "Ana")
    for (nombre in nombres) {
        println(nombre)
    }
    println("ForEach aplicado al arreglo")
    nombres.forEach { nombre ->
        println(nombre)
    }
    println("ForEachIndexed aplicado al arreglo")
    nombres.forEachIndexed { indice, valor ->
        println("$indice = $valor")
    }
    println("Formas de Recorrer el arreglo 1")
    for (n in 0..nombres.size - 1) {
        println("$n = ${nombres.get(n)}")
    }
    println("Formas de Recorrer el arreglo 2")
    for (n in 0..<nombres.size) {
        println("$n = ${nombres.get(n)}")
    }
    println("Formas de Recorrer el arreglo 3")
    for (n in nombres.indices) {
        println("$n = ${nombres.get(n)}")
    }
    println("Formas de Recorrer el arreglo 4")
    for(n in 0 until nombres.size){
        println("$n = ${nombres[n]}")
    }
}