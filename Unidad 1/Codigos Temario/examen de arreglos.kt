fun main(){
    var lista = mutableListOf<Int>()
    var num: Int
    for (i in 0..9){
        print("Digita un numero: ")
        num=readln().toInt()
        lista.add(num)
    }
    var minimo = lista[0]
    var maximo = lista[0]
    for(i in 0..9) {
    if(lista[i]<minimo){
        minimo= lista[i]
    }
        if(lista[i]>maximo){
            maximo=lista[i]
        }
        println(lista[i])
    }
    println("Mínimo: $minimo")
    println("Máximo: $maximo")
}