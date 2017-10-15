import scala.collection.mutable.ArrayBuffer

trait GeometryLoader {
  def load(): ArrayBuffer[Point]
}
