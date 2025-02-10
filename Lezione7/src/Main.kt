class Prodotto constructor(codice:String, descrizione:String, quantita:Int, prezzo:Double) {
    var codice:String = codice
    var descrizione:String = descrizione
    var quantita:Int = quantita
    var prezzo:Double = prezzo

    fun calcolaSconto(sconto:Double):Double {
        var calcolo = prezzo * sconto
        return prezzo - calcolo
    }

}

fun main() {

    var prodottoP = Prodotto ("C16A7", "Pomodori", 10, 7.50)

    println("Codice: ${prodottoP.codice} Descrizione: ${prodottoP.descrizione} " +
            "Prezzo Totale ${prodottoP.calcolaSconto(0.5)}")

}