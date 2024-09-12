// Created by: JFabrizzio5

fun main() {
    println("Introduce tu salario mensual bruto:")
    val grossSalary = readLine()?.toDoubleOrNull() ?: 0.0

    println("Introduce el porcentaje de impuestos:")
    val taxPercentage = readLine()?.toDoubleOrNull() ?: 0.0

    val monthlyTaxes = grossSalary * (taxPercentage / 100)
    val netMonthlySalary = grossSalary - monthlyTaxes
    val netAnnualSalary = netMonthlySalary * 12
    val annualTaxes = monthlyTaxes * 12


    //Utilizo el formato de 2 decimales
    println("Salario mensual neto: $${"%.2f".format(netMonthlySalary)}")
    println("Impuestos a pagar por mes: $${"%.2f".format(monthlyTaxes)}")
    println("Salario anual neto: $${"%.2f".format(netAnnualSalary)}")
    println("Impuestos a pagar por año: $${"%.2f".format(annualTaxes)}")
}
