/**
 *
 */
class DNA(s: String) {
  require(s.count(!DNA.valids.contains(_)) == 0)

  def count(c: Char) = {
    require(DNA.valids.contains(c))
    nucleotideCounts.get(c).getOrElse(0)
  }

  def nucleotideCounts(): Map[Char, Int] = {
    if (s == null || s.isEmpty) DNA.empty
    else (DNA.empty ++ s.groupBy(identity).mapValues(_.length)).filterKeys(DNA.valids.contains(_))

  }
}

object DNA {
  val valids = Seq('A', 'C', 'T', 'G')
  val empty = valids map ((_, 0)) toMap
}
