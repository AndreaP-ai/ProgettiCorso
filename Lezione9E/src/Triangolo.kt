class Triangolo(): FiguraGeometrica() {

    @Override
    fun getArea(): Double {
        return base * altezza / 2
    }

}