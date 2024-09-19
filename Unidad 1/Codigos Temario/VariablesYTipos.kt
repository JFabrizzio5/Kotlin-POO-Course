fun main() {
    //2CV22 HERNANDEZ GONZALEZ JOSEPH FABRIZZIO
    // 1. VARIABLES MUTABLES E INMUTABLES
    var nombreMutable = "Fabrizzio"  // Mutable
    val nombreInmutable = "Jos5Dev"  // Inmutable

    // 2. INFERENCIA DE TIPOS
    var edad = 20  // Kotlin infiere que es Int
    var altura = 1.75  // Infere que es Double
    var esEstudiante = true  // Boolean

    println("Nombre Mutable: $nombreMutable, Edad: $edad, Altura: $altura, Estudiante: $esEstudiante")

    // 3. DECLARACIÓN EXPLÍCITA DE TIPOS
    val pi: Float = 3.1416F
    val resultadoExacto: Double = 2.718281828459045
    println("Valor de Pi (Float): $pi, Valor exacto de e (Double): $resultadoExacto")

    // 4. VARIABLES NULABLES (Uso de `?`)
    var nombreNulleable: String? = null
    println("Nombre nulleable: $nombreNulleable")

    // Usamos operador Elvis `?:` para asignar un valor por defecto si es null
    nombreNulleable = nombreNulleable ?: "Valor predeterminado"
    println("Nombre después del operador Elvis: $nombreNulleable")

    // 5. ARRAYS Y COLECCIONES
    val listaDeNombres: Array<String> = arrayOf("Ana", "Paco", "Luis")
    val listaDeNumeros: List<Int> = listOf(1, 2, 3, 4)
    val conjuntoDeNumeros: Set<Int> = setOf(1, 2, 3)  // No permite duplicados
    val mapa: Map<String, Int> = mapOf("Edad" to 20, "Año" to 2024)

    println("Lista de Nombres: ${listaDeNombres.joinToString(", ")}")
    println("Conjunto de Números: $conjuntoDeNumeros")
    println("Mapa de valores: $mapa")

    // 6. MUTABLES CON OPERACIONES
    var listaMutable = mutableListOf(1, 2, 3)
    listaMutable.add(4)
    listaMutable.remove(2)
    println("Lista mutable modificada: $listaMutable")

    // 7. USO DE LATEINIT (Inicialización tardía)
    lateinit var textoLargo: String
    textoLargo = "Este texto fue inicializado más tarde."
    println(textoLargo)

    // 8. CONSTANTES
    val CONSTANTE_PI = 3.1416  // Constantes usando val
    println("Constante Pi: $CONSTANTE_PI")
}
