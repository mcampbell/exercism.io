/**
 *
 */
class PhoneNumber(s: String) {
  val rep = sanitize

  def areaCode: String = {
    rep.take(3)
  }

  def number: String = {
    rep
  }

  override def toString: String = {
    s"($areaCode) ${rep.slice(3, 6)}-${rep.takeRight(4)}"
  }

  private def sanitize = {
    val good_number = """1?([0-9]{10})""".r
    val cleaned: String = s.replaceAll("[^0-9]", "")
    cleaned match {
      case good_number(keeper) => keeper
      case _ => "0000000000"
    }

  }

}
