fun main() {

    var numero = 10;
    var secondo:Double = numero.toDouble();

    var x:String = "Andrea";
    var y:String? = "Palatta";

    x = y!!; // Controlla che il valore non è nullo

    println("Numero = $numero e il secondo numero è $secondo");

    print("Nome: ");
    var nome = readLine();

    print("Cognome: ");
    var cognome = readLine(); // readLine legge una stringa

    print("Età: ");
    var anni = readln().toInt();

    var bool:Boolean = numero is Int; // Confronta se la variabile è di un certo tipo
    println(bool);
}
