// Summary1/Task3.kt
package summaryIExercise3

import booleansExercise3.and
import booleansExercise3.or

fun first(a: Boolean, b: Boolean, c: Boolean): Boolean =
  if (a) and(b,c) else false

fun second(a: Boolean, b: Boolean, c: Boolean): Boolean =
  if (a) true else or(b,c)

fun main() {
  println(first(true, true, true))
  println(first(true, false, true))

  println(second(false, false, false))
  println(second(false, true, false))
}
/* Output:
true
false
false
true
*/