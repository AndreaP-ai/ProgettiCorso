package Principale

import Prodotti.ProdottiSpecifici
import Prodotti.Prodotto


fun main() {

    var s1 = Prodotto("A23T6", "Pomodori", 50.0, 9.50)
    var s2 = ProdottiSpecifici("abc123", "secondo prodotto", 5.0, 9.0, "acciaio")

    println("Codice: ${s2.getCodice()}, Descrizione: ${s2.getDescrizione()}, Quantita: ${s2.getQuantita()}" +
            " Prezzo: ${s2.getPrezzo()}, Materiale: ${s2.getMateriale()}" )
}