import com.opencsv.CSVReader
import java.io.FileReader
import java.text.NumberFormat
import java.util.Locale
import scala.collection.JavaConversions._
import scala.collection.mutable.ArrayBuffer



class GeometryLoaderCsv(fileName:String) extends GeometryLoader {


  override def load(): ArrayBuffer[Point] = {
    val nf = NumberFormat.getInstance(Locale.GERMANY)
    var pointArray = new  ArrayBuffer[Point]
    val reader = new CSVReader(new FileReader(fileName),';', '\'', 1)
    for (row <- reader.readAll) {
      val pointNr = row(0).toInt
      val pointName = row(1)
      val x = nf.parse(row(2)).doubleValue()
      val y = nf.parse(row(3)).doubleValue()
      var point = new Point(pointNr,pointName,x,y)
      pointArray += point
    }
    pointArray
  }
}
