class Vector(_x: Double, _y: Double, _z: Double) : PointVectorBase(0.0,0.0,0.0) {
    companion object {
        val zero: Vector = Vector(0.0,0.0,0.0)
    }

    override var x = _x
    override var y = _y
    override var z = _z
    val vect: Vector = Vector(_x,_y,_z)
    val length: Double
        get() {
        return calculateDistanceTo(vect)
    }

    fun vector(x: Double = 0.0, y: Double = 0.0, z: Double = 0.0) {
        super.pointVectorBase(x,y,z)
    }
}
