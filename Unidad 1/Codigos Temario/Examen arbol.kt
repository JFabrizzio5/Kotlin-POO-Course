fun main(){
    print("Ingrese el tamaño del arbol: ")
    var n = readln().toInt()
    for(i in 1..n){
        for (j in -5..<n-i){
            print(" ")
        }
        for(k in 1..<i*2){
            print("*")
        }
        println()
    }
      var tronco = n/3
    for ( i in 1..tronco){
for( j in 1..<n+5){
    print(" ")
}
        println("||")
    }

}