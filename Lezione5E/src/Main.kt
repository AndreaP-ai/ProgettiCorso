fun main() {

    for(i in 1..6) {
        for(j in 6 downTo i) {
            print("*")
        }
        println()
    }

    for(k in 1..6) {
        for(y in 1..k) {
            print("#")
        }
        println()
    }

    for(a in 1..6) {
        for(b in 1..a) {
            print(b)
        }
        print("     ")
        var m = a + 1
        for(c in 7 downTo m) {
            print(c - a)
        }
        println()
    }

}