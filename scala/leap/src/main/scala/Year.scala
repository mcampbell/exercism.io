/**
 *
 */
case class Year(val y: Int) {
  val isLeap = (y % 4 == 0) && ((y % 100 != 0) || (y % 400 == 0))
}
