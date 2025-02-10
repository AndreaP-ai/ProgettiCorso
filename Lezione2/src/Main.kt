fun main() { // E' la funzione principale

    var k: Int = 10;
    var x = 1; // Variabile mutabile
    val y = 100; // Variabile immutabile
    var nome = "Andrea"; // Dichiarazione implicita
    var cognome: String = "Palatta"; // Dichiarazione esplicita
    var carattere = '$';
    var carattereNuovo: Char = '&';
    var vero = true;
    var falso: Boolean = false;
    var l: Long = 10L;
    var f: Float = 12.5f;
    var arr = arrayOf(2, 6, 9, 10);

    println("Variabile mutabile " + x);
    println("Variabile immutabile " + y);
    println("Mi chiamo " + nome + " " + cognome);
    println(arr[3] + arr[0]);
}