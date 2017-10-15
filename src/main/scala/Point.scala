class Point(var pointNr:Int, var pointName:String, var x:Double, var y:Double) {

  def sumUp(other: Point): Point = {
    this.x += other.x
    this.y += other.y
    this
  }

  def multiply(scalar: Double): Point ={
    this.x *= scalar
    this.y *= scalar
    this
  }

}
