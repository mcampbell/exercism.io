/**
 *
 */
object HelloWorld {

  /**
   * If we have a name, return the string with the name in the greeting.
   * If they pass null, this is the same as not passing anything.
   */
  def hello(name: String): String = {
    name match {
      case null => hello
      case _ => s"Hello, $name!"
    }
  }

  /**
   * If the user passes no name, use the default greeting.
   */
  def hello(): String = {
    "Hello, World!"
  }

}
