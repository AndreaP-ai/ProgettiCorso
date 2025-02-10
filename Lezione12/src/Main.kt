fun main() {

    var list1 = listOf<Any>("Pippo", 10.5, "Pluto", 1);

    for(i in 0..list1.size -1) {
        print("${list1[i]} ");
    }

    println();

    var list2 = mutableListOf<Any>("Pippo", 10.5, "Pluto", 1);
    list2[0] = "Prova";
    list2[1] = 20.7;

    for(i in 0..list1.size -1) {
        print("${list2[i]} ");
    }

}