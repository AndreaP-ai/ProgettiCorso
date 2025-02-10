fun main() {

    var arr = arrayOf(2, 10, 15, 30)

    for(x in arr.indices) {
        println(arr[x])
    }

    print("Inserisci un numero: ")
    var numero = readln().toInt()
    var somma:Int = 0;

    while(numero < 10) {
        if(numero == 5) break
        somma += numero
        numero++
    }
    println("$somma")

    print("Inserisci il seondo numero: ")
    var y = readln().toInt()
    var z:Int = 0

    while(y < 10) {
        y++
        if(y == 5) continue // Salta il 5
        z += y
        println("$y")
    }
    println("$z")
}