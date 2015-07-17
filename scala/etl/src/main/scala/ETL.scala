/**
 *
 */
object ETL {
  /*

  This may take some explaining to eliminate the feeling of code golf.  From the inside out...

  In the inner map, we're taking the value, a sequence of strings, and mapping over that.  The
  function there is taking each string, lower casing it, and returning a map entry of it as the
  key, and the outer value for the new key (swapping them).  In the process, it's lowercasing
  the key.

  The OUTER map call does the above work with every key/value.  The result of this is thus
  a LIST of Map()s from the inner part, so we flatten that out (with flatMap).

   */

  def transform(old: Map[Int, Seq[String]]) = {
    old flatMap { case (k, v) => {
      v map {
        (_.toLowerCase() -> k)
      }
    }
    }
  }
}
