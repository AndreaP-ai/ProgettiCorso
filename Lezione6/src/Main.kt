fun main() {
    stampa()
    somma(5, 10)
    moltiplica(5, 5, "La somma è:")

    var k:Double = dividi(10.0, 5.0)
    println(k)

}

fun stampa() {
    println("Questa è una funzione")
}

fun somma(a:Int, b:Int) {
    var c = a + b
    println("Il risultato è: $c")
}

fun moltiplica(a:Int, b:Int, k:String) {
    var d = a * b
    println("$k $d")
}

fun dividi(x:Double, y:Double):Double {
    var z = x / y
    return z
}