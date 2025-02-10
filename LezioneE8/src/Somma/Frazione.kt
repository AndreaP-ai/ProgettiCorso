package Somma

class Frazione(num:Int, denom:Int) {
    private var num:Int = num
    private var denom:Int = denom

    fun getNum():Int {
        return num
    }

    fun getDen():Int {
        return denom
    }

    fun somma(frazione:Frazione):Frazione {
        var den = this.denom * frazione.getDen()
        var numeratore = ((frazione.getDen() * this.num) + (frazione.getNum() * this.denom))
        var f = Frazione(numeratore, den)
        return f
    }

    fun stampa():String {
        return "$num / $denom"
    }
}