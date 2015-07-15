import scala.collection.immutable.TreeMap

/**
 * Mimic a school database.  For now, just use a file that constantly gets read into a map and re-written
 * from scratch on each call.
 */
class School {
  var db: Map[Int, Seq[String]] = Map()

  def sorted = {
    var ret = TreeMap[Int, Seq[String]]()
    db.toList foreach {
      case (key, value) =>
        ret = ret + (key -> value.sorted)
    }
    ret
  }

  def grade(grade: Int) = db.get(grade).getOrElse(List())

  def add(name: String, grade: Int) = {
    val names = db.get(grade).getOrElse(List())
    db = db + (grade -> (names ++ List(name)))
    db
  }

}
