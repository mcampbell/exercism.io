

/**
 *
 */
case class Anagram(s: String) {
  def matches(strings: Seq[String]): Seq[String] = {

    strings.filter(candidate =>
      candidate.toLowerCase != s.toLowerCase &&
        candidate.toLowerCase.sorted == s.toLowerCase.sorted)
      .toSet.toSeq
  }
}
