package Prodotti

open class Prodotto(codice:String, descrizione:String, quantita:Double, prezzo:Double) {

    private var codice: String = codice
    private var descrizione: String = descrizione
    private var quantita: Double = quantita
    private var prezzo: Double = prezzo

    fun setCodice(codice: String) {
        if (codice.length <= 16) {
            this.codice = codice
        } else {
            this.codice = codice.substring(0, 16)
            println("Attenzione codice troppo lungo, troncato")
        }
    }

    fun setDescrizione(descrizione: String) {
        if (descrizione.length <= 16) {
            this.descrizione = descrizione
        } else {
            this.descrizione = descrizione.substring(0, 50)
            println("Attenzione descrizione troppo lunga, troncata!")
        }
    }

    fun setQuantita(quantita: Double) {
        this.quantita = quantita
    }

    fun setPrezzo(Prezzo: Double) {
        this.prezzo = prezzo
    }

    fun getCodice(): String {
        return codice
    }

    fun getDescrizione(): String {
        return descrizione
    }

    fun getQuantita(): Double {
        return quantita
    }

    fun getPrezzo(): Double {
        return prezzo
    }


}