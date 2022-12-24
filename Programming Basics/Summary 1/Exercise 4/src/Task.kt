// Summary1/Task4.kt
package summaryIExercise4

fun testLong() {
  print(Long.MAX_VALUE+1)
}

fun testDouble() {
  print(Double.MAX_VALUE+1)
}

fun testDouble2() {
  println(Double.MAX_VALUE == Double.MAX_VALUE+1)
}

fun main() {
  testLong()
  testDouble()
  testDouble2()
}
/* Output:
-9223372036854775808
1.7976931348623157E308
true
 */