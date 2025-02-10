fun main() {

    print("Voto teorico: ");
    var votoTeorica = readln().toInt();

    print("Voto di pratica: ")
    var votoPratica = readln().toInt();

    var votoFinale = votoTeorica + votoPratica;

    if(votoTeorica <= 0 && votoFinale > 18) {
        println("Rimandato");
    } else if (votoTeorica <= 0 && votoPratica < 18) {
        println("Bocciato");
    } else if (votoTeorica > 0 && votoFinale < 18) {
        println("Da migliorare");
    } else if (votoFinale == 31 || votoFinale == 32) {
        println("Congratulazioni, 30 e lode!");
    } else {
        println("Ammesso! $votoFinale");
    }

    print("Inserisci colore: ");
    var colore = readln();

    when(colore) {
        "Rosso" -> println("Hai inserito rosso");
        "Verde" -> {
            println("Hai inserito il Verde");
            println("Un bel colore!");
        }
        else -> "Non è un colore!"
    }

    print("Insersci un numero: ");
    var numero = readln().toInt();

    when(numero) {
        in 1..5 -> println("Numero piccolo");
        in 6..10 -> println("Numero medio");
        in 11..20 -> println("Numero grande");
        !in 1..50 -> println("Numero non presente");
    }
}