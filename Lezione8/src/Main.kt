class Prodotto(codice:String, descrizione:String, quantita:Double, prezzo:Double) {
    private var codice:String = codice
    private var descrizione:String = descrizione
    private var quantita:Double = quantita
    private var prezzo:Double = prezzo

    fun setCodice(codice:String) {
        if(codice.length <= 16) {
            this.codice = codice
        } else {
            this.codice = codice.substring(0, 16)
            println("Attenzione codice troppo lungo, troncato")
        }
    }

    fun getCodice():String {
        return codice
    }

    fun setDescrizione(descrizione: String) {
        if(descrizione.length <= 16) {
            this.descrizione = descrizione
        } else {
            this.descrizione = descrizione.substring(0, 50)
            println("Attenzione descrizione troppo lunga, troncata!")
        }
    }

    fun getDescrizione():String {
        return descrizione
    }

    fun setQuantita(quantita: Double) {
        if(quantita < 0.0) {
            println("Attenzione quantità negativa")
            this.quantita = 0.0
        } else {
            this.quantita = quantita
        }
    }

    fun getQuantita():Double {
        return quantita
    }

    fun setPrezzo(prezzo:Double) {
        if(prezzo < 0.0) {
            println("Prezzo non valido")
            this.prezzo = 0.0
        } else {
            this.prezzo = prezzo
        }
    }

    fun getPrezzo():Double {
        return prezzo
    }
}

fun main() {

    var s1 = Prodotto("A23T6", "Pomodori", 50.0, 9.50)

    println("Codcie: ${s1.getCodice()}, Descrizione ${s1.getDescrizione()}, Quantità: ${s1.getQuantita()}, " +
            "Prezzo: ${s1.getPrezzo()}")
}