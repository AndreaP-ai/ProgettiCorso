import principale.Permessi

fun main() {

    val x = Permessi<String>()

    x.user = "Pippo"
    x.pass = "abc"
    x.id = "132A"

    var myHash = HashMap<Int, String>()
    myHash.put(1, "Ciao")
    myHash.put(26, "Arrivederci")

    println("${x.user}, ${x.pass}, ${x.id}")

    for(i in myHash.keys) {

        println(myHash.get(i)) // Stampa tutte le chiavi del myHash

    }

}

