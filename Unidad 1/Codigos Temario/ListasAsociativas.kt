fun main() {
    // ARREGLO SOLO LECTURA
    val arr = listOf("Hugo", "Paco", "Ana")
    println("Contenido del arreglo: $arr")

    // Imprimir solo los índices
    println("\nÍndices del arreglo solo lectura:")
    for (i in arr.indices) {
        print("$i ")
    }
    println()

    // Imprimir solo los valores
    println("\nValores del arreglo solo lectura:")
    for (value in arr) {
        print("$value ")
    }
    println()

    // ARREGLO MUTABLE
    println("\nArreglo mutable")
    val mutable = mutableListOf("Hugo", "Paco", "Ana")
    println("Contenido del arreglo mutable: $mutable")

    // Imprimir solo los índices del arreglo mutable
    println("\nÍndices del arreglo mutable:")
    for (i in mutable.indices) {
        print("$i ")
    }
    println()

    // Imprimir solo los valores del arreglo mutable
    println("\nValores del arreglo mutable:")
    for (value in mutable) {
        print("$value ")
    }
    println()

    // Modificar un valor en el arreglo mutable por índice
    mutable[1] = "Luis"
    println("\nContenido del arreglo mutable después de modificar el índice 1: $mutable")

    // Eliminar un valor por índice
    mutable.removeAt(0)
    println("Contenido del arreglo mutable después de eliminar el índice 0: $mutable")

    // Agregar un nuevo valor en el índice 1
    mutable.add(1, "María")
    println("Contenido del arreglo mutable después de agregar 'María' en el índice 1: $mutable")

    // ARRAY ASOCIATIVO
    println("\nArray asociativo")
    val asociativo = mutableMapOf(
        "nombre1" to "Hugo",
        "nombre2" to "Paco",
        "nombre3" to "Ana"
    )
    println("Contenido del array asociativo: $asociativo")

    // Imprimir solo las claves del array asociativo
    println("\nClaves del array asociativo:")
    for (key in asociativo.keys) {
        print("$key ")
    }
    println()

    // Imprimir solo los valores del array asociativo
    println("\nValores del array asociativo:")
    for (value in asociativo.values) {
        print("$value ")
    }
    println()

    // Modificar un valor por su clave
    asociativo["nombre2"] = "Luis"
    println("\nContenido del array asociativo después de modificar 'nombre2': $asociativo")

    // Eliminar un par clave-valor
    asociativo.remove("nombre1")
    println("Contenido del array asociativo después de eliminar 'nombre1': $asociativo")

    // Agregar un nuevo par clave-valor
    asociativo["nombre4"] = "Juan"
    println("Contenido del array asociativo después de agregar 'nombre4': $asociativo")

    // Imprimir clave y valor formateados
    println("\nImpresión formateada clave-valor:")
    for ((key, value) in asociativo) {
        println("Clave: $key, Valor: $value")
    }

    // Comprobar si una clave existe
    val keyToCheck = "nombre3"
    if (asociativo.containsKey(keyToCheck)) {
        println("\nLa clave '$keyToCheck' existe con el valor: ${asociativo[keyToCheck]}")
    } else {
        println("\nLa clave '$keyToCheck' no existe.")
    }

    // Comprobar si un valor existe
    val valueToCheck = "Juan"
    if (asociativo.containsValue(valueToCheck)) {
        println("El valor '$valueToCheck' existe en el array asociativo.")
    } else {
        println("El valor '$valueToCheck' no existe en el array asociativo.")
    }
}
