package Principale

import Calcolatrice.Calcolatrice

fun main() {

    var c1 = Calcolatrice()

    var somma: Int = c1.somma(10, 5)
    println("Risultato: $somma")

    var moltiplicazione = c1.moltiplica(10, 4)
    println("Risultato: $moltiplicazione")

    var sottrazione = c1.sottrai(8, 4)
    println("Risultato: $sottrazione")

}