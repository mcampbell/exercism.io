/**
 *
 */
class Bob {
  val whatever = "Whatever."
  val sure = "Sure."

  def containsLetters(saying: String): Boolean = {
    val letters = 'A' to 'Z'
    saying != null && saying.toUpperCase.exists(letters.contains(_))
  }

  def isAQuestion(saying: String): Boolean = {
    saying.endsWith("?")
  }

  /**
   * Set up the question/answer rubric.  There are a few rules that are ambiguous, but go by
   * the tests to see what's right. (eg. the rules say he says "sure." if you ask him a question,
   * but they also say he responds differently to shouting.  The order of precedence is not defined
   * and the tests work in opposite order that the rules are listed.)
   *
   * I wanted to use a match here, but I wasn't sure how to do that with the particular set of
   * constraints.  (regexes?)  Also wasn't sure that it would be any clearer.
   *
   */
  def hey(saying: String): String = {

    if (saying == null || saying.trim.isEmpty) {
      "Fine. Be that way!"

    } else if (saying == saying.toUpperCase) {
      // if there are no words (no letters), we probably aren't shouting.
      if (containsLetters(saying)) {
        "Whoa, chill out!"

      } else if (isAQuestion(saying)) {
        sure

      } else {
        whatever
      }


    } else if (isAQuestion(saying)) {
      sure

    } else {
      whatever
    }
  }

}
