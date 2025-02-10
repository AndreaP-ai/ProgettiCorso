package Principale
import Somma.Frazione

fun main() {

    var f1 = Frazione(10, 4)
    var f2 = Frazione(4, 8)
    var f3 = f1.somma(f2)

    println("${f1.stampa()} + ${f2.stampa()} = ${f3.stampa()}")
}