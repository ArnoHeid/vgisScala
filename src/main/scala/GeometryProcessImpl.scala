import scala.collection.mutable.ArrayBuffer
import scala.collection.JavaConversions._

class GeometryProcessImpl(pointArray:ArrayBuffer[Point]) extends GeometryProcess {
  override def getCenter: Point = {
    val center = new Point(9999,"Center",0, 0)
    for (point <- pointArray) {
      center.sumUp(point)
    }
    center.multiply(1.0 / this.pointArray.size)
  }

  override def getSize: Int = this.pointArray.size
}
