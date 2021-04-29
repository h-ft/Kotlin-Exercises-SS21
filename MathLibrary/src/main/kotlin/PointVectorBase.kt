import kotlin.math.*

abstract class PointVectorBase(_x: Double, _y: Double, _z: Double) {
    // Constructor for PointVectorBase
    open var x = _x
    open var y = _y
    open var z = _z

    fun pointVectorBase(x: Double = 0.0, y: Double = 0.0, z: Double = 0.0) {
        this.x = x
        this.y = y
        this.z = z
    }

    protected fun calculateDistanceTo(endPvBase: PointVectorBase) : Double {
        val x:Double = (endPvBase.x - this.x).pow(2.0)
        val y:Double = (endPvBase.y - this.y).pow(2.0)
        val z:Double = (endPvBase.z - this.z).pow(2.0)
        return sqrt(x + y + z) // Root of ((x-xThis)^2 + (y-yThis)^2 + (z-zThis)^2)
    }
}


