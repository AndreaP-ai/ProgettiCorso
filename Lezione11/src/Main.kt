fun main() {

    var myArr = ArrayList<Int>();
    myArr.add(100);
    myArr.add(120);
    myArr.add(110);

    println(myArr);
    println(myArr.get(0)) // Stampa l'elemento in indice 0

    for(i in 0..myArr.size -1) { // Prende tutti gli elementi dell'array e li stampa
        println(myArr[i]);
    }

}