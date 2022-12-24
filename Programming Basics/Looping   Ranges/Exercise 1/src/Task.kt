// LoopingAndRanges/Task1.kt
package loopingAndRangesExercise1

fun factorial(n: Int): Long {
  var factorial = 1L
  for (f in n downTo 1)
    factorial *= f
  return factorial

}

fun main() {
  println(factorial(10))  // 3628800
}