fun main() {
    // 2CV22
    // Arreglos Mutables e Inmutables

    // ¿Cuántos tipos de datos son y cuáles?
    // En Kotlin hay 8 tipos básicos que son clases.
    // En Java hay 9 tipos primitivos (en minúsculas).

    // Arreglo, colección de datos del mismo tipo
    val arr = intArrayOf(10, 20, 30, 40, 50)
    println("Tamaño del arreglo: ${arr.size}")

    // Forma 1 de recorrer el arreglo
    println("Recorrido con for simple:")
    for (i in 0..arr.size - 1) {
        println("Elemento $i = ${arr[i]}")
    }

    // Forma 2 de recorrer el arreglo con errores corregidos
    println("Recorrido con for optimizado:")
    for (i in arr.indices) {
        println("Elemento $i = ${arr[i]}")
    }

    // Foreach sin indexar
    println("Recorrido con foreach:")
    arr.forEach {
        println(it)
    }

    // Foreach indexado
    println("Recorrido con foreach indexado:")
    arr.forEachIndexed { index, value ->
        println("Elemento $index = $value")
    }

    // Cambiar valor del arreglo
    println("Cambiando valor del índice 1:")
    arr[1] = 100
    arr.forEach { num ->
        println(num)
    }

    // Actualizamos cada elemento y lo multiplicamos por 2
    println("Multiplicando cada elemento por 2:")
    arr.forEachIndexed { index, valor ->
        arr[index] = valor * 2
        println("Elemento $index actualizado = ${arr[index]}")
    }

    // Declaración de un arreglo mutable
    val mutableArr = mutableListOf(5, 10, 15, 20, 25)
    println("Arreglo mutable antes de la modificación: $mutableArr")

    // Modificando el arreglo mutable
    mutableArr[2] = 50
    println("Arreglo mutable después de la modificación: $mutableArr")

    // Añadir elementos a un arreglo mutable
    mutableArr.add(30)
    println("Arreglo mutable después de agregar un elemento: $mutableArr")

    // Borrando elementos en un arreglo mutable
    mutableArr.removeAt(0)
    println("Arreglo mutable después de borrar el primer elemento: $mutableArr")
}
