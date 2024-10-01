fun main(){
    println("=====Funciones=====")
    println("invocacion de una funcion basica")
    basic()
    println("invocacion de una funcion con argumentos o parametros ")
    print("dame el nombre: ")
    val name = readln().toString()
    print("dame la edad: ")
    val age= readln().toInt()
    arguments(name, age)

    println("invocacion de una funcion con valores de retorno")
    println("dame el valor de a: ")
    val a= readln().toDouble()
    println("dame el valor de b: ")
    val b=readln().toDouble()
    val c = suma(a,b)
    println("la suma de a + b es = $c")
    val c1 = suma1(a,b)
    println("la suma de a + b es igual a $c1")

    //sobrecarga
    println("====Sobrecarga de funciones o metodos")
    print("damer la edad: ")
    val edad=readln().toInt()
    overload(edad)
    print("escribe tu trabajo: ")
    val trabajo=readln()
    overload (trabajo)
    println("escribe tu lenguaje favorito: ")
    val lenguaje=readln()
    overload(trabajo, lenguaje)

    //llamada a la funcion con argumentos nombrados
    println("salario base de $5000.00 y porcernaje de impuesto del 10%")
    println("impuesto a pagar con salario base y porcentaje de impuesto fijo es de $${calcularImpuesto()}")
    println("impuesto a pagar $${calcularImpuesto(10_000.00, 16.00)}")
    println("impuesto a pagar con salario base de $20,000.00 es $${calcularImpuesto(20_000.00)}")
    println("impuesto a pagar con tasa de impuesto de 5.0% es $${calcularImpuesto(pcteImpuesto=5.0)}")
}

fun basic(){
    println("hola a todos")
}
fun arguments(nombre: String, age: Int ){
    println("Hola $nombre , tu edad es $age")
}
fun suma(a:Double, b:Double):Double{
    return a+b
}
fun suma1(a:Double, b:Double)=a+b

fun overload(edad: Int){
    println("mi edad es $edad")
}

fun overload(trabajo:String){
    println("mi trabajo es: $trabajo")
}
fun overload(trabajo: String, lenguaje: String ="kotlin"){
    println("mi trabajo es $trabajo con el lenguaje $lenguaje")
}
fun overload(nombre: String, edad: Int, lenguaje: String){
    println("mi nomobre es $nombre, mi edad es $edad y mi lenguaje favorito es $lenguaje")
}
fun calcularImpuesto(salario:Double = 5000.0, pcteImpuesto: Double = 10.00): Double {
    val totalImpuesto = (salario / 100)*pcteImpuesto
    return totalImpuesto
}
