package Principale

import Prodotti.Prodotti // Importa il package Prodotti

fun main() {

    var s1 = Prodotti("A23T6", "Pomodori", 50.0, 9.50)

    println("Codcie: ${s1.getCodice()}, Descrizione ${s1.getDescrizione()}, Quantità: ${s1.getQuantita()}, " +
            "Prezzo: ${s1.getPrezzo()}")
}