// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(number: Int): Int {
  var i = 0
  var r = 0
  while (i <= number){
    r += i
    i++
  }
  return r
}

fun main() {
  println(sum(10))  // 55
}