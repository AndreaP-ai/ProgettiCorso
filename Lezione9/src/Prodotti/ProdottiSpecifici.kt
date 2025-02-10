package Prodotti

class ProdottiSpecifici(codice:String, descrizione:String,
                        quantita:Double, prezzo:Double, materiale:String): Prodotto(codice, descrizione, quantita, prezzo) {


   private var materiale: String = materiale

    fun setMateriale(materiale: String) {
        this.materiale = materiale
    }

    fun getMateriale(): String {
        return materiale
    }


}