fun main() {

    var r1 = Rettangolo()
    var q1 = Quadrato()
    var t1 = Triangolo()

    r1.setArea(10.5, 8.0)
    q1.setArea(8.6, 9.2)
    t1.setArea(5.4, 6.9)

    println("Rettangolo: ${r1.getArea()} Quadrato: ${q1.getArea()} Triangolo: ${t1.getArea()}")
}


