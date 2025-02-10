class Car(resa:Int) {
    var resa:Int = resa
    var serbatoio:Double = 0.0

    fun drive(km:Double) {
        var consumo = km / resa
        serbatoio -= consumo
    }

    fun controllaBenz():Double {
        return serbatoio
    }

    fun aggiungiBenz(benzina:Double) {
        serbatoio += benzina
    }
}

fun main() {

    var auto = Car(15)
    auto.aggiungiBenz(15.5)

    println("Nel serbatoio ci sono: ${auto.controllaBenz()}")

    auto.drive(150.0)
    println("Nel serbatoio rimane: ${auto.controllaBenz()}")

}