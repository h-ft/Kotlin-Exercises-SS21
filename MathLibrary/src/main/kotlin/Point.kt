class Point(_x: Double, _y: Double, _z: Double) : PointVectorBase(0.0,0.0,0.0) {
    companion object {
        val origin: Point = Point(0.0,0.0,0.0)
    }

    override var x = _x
    override var y = _y
    override var z = _z

    fun point(x: Double = 0.0, y: Double = 0.0, z: Double = 0.0){
        super.pointVectorBase(x,y,z)
    }

    fun distanceTo(endPoint: Point): Double {
        return super.calculateDistanceTo(endPoint)
    }
}