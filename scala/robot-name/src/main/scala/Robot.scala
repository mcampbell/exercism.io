import java.util.Random

/**
 *
 */
class Robot() {
  var myName: Option[String] = None

  def reset() = myName = None

  def name: String = myName match {
    case None =>
      myName = Some(Robot.makeName)
      myName.get
    case Some(name) => name
  }

}

object Robot {
  val MAX = 26 * 26 * 10 * 10 * 10
  val rnd = new Random()

  def makeName: String = {
    val i = rnd.nextInt(MAX)
    f"${((i / 1000) / 26 + 'A')}%c${((i / 1000) % 26 + 'A')}%c${(i/1000)}%03d"
  }
}
