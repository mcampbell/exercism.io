

/**
 *
 */
case class Phrase(s: String) {

  private def normalize(s: String) = {
    if (s == null) List()
    else {
      val badChars = """[^a-zA-Z0-9']"""
      s.replaceAll(badChars, " ").split( """\s+""").toList
    }
  }

  def wordCount = {
    normalize(s)
      .map(_.toLowerCase)
      .groupBy(identity)
      .mapValues(_.size)
  }
}
