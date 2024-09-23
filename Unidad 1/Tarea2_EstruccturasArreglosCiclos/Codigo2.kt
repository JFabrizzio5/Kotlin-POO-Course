// Created by: 2CV22 HERNANDEZ GONZALEZ JOSEPH FABRIZZIO
fun calculateAverage(grades: Array<Double>): Double {
    return grades.average()
}

fun highestGrade(grades: Array<Double>): Double {
    return grades.maxOrNull() ?: 0.0
}

fun lowestGrade(grades: Array<Double>): Double {
    return grades.minOrNull() ?: 0.0
}

fun failingStudents(students: Array<String>, grades: Array<Double>): List<Pair<String, Double>> {
    return students.zip(grades).filter { it.second < 60.0 }
}

fun main() {
    val students = arrayOf("José", "Alberto", "Laura", "Noel", "Erika", "Daniel")
    val grades = arrayOf(31.0, 94.0, 98.5, 75.0, 46.5, 75.0)

    val average = calculateAverage(grades)
    val maxGrade = highestGrade(grades)
    val minGrade = lowestGrade(grades)
    val failing = failingStudents(students, grades)

    println("Promedio de calificación: $average")
    println("Calificación más alta: $maxGrade")
    println("Calificación más baja: $minGrade")

    println("Reprobados:")
    for ((student, grade) in failing) {
        println("$student, $grade")
    }
}
