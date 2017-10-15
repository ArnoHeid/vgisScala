object App {
  def main(args: Array[String]): Unit = {
    var gLoader = new GeometryLoaderCsv("_public___poi_.csv")
    val gProcess = new GeometryProcessImpl(gLoader.load)
    val center = gProcess.getCenter
    println("Point: x: " + center.x + "|y: " + center.x)
    println(gProcess.getSize)

  }
}
