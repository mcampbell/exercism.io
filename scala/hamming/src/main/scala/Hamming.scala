/**
 *
 */
object Hamming {
  def compute(s: String, s1: String) = {
    if (s.length != s1.length) throw new IllegalArgumentException()
    else s.zip(s1).count(pair => pair._1 != pair._2)
  }

}