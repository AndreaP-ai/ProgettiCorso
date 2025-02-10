fun main() {

    print("Inserire importo: ");
    var importo = readln().toInt();
    var interesse:Int = 0;
    var totale:Int = 0;

    when(importo) {
        in 1..10000 -> interesse = importo * 10 / 100;

        in 10001..20000 -> interesse = 1000 + (importo - 10000) * 7 / 100

        in 20001..30000 -> interesse = 1700 + (importo - 20000) * 5 / 100;

        !in 1..30000 -> {
            if(importo > 30000) {
                interesse = 1750 + (importo - 30000) * 3 / 100;
            } else {
                interesse = -1;
            }
        }
    }

    totale = importo + interesse;
    println("La tassa è: $interesse");
    println("Il totale è: $totale");
}
