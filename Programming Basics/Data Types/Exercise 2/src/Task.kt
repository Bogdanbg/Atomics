// DataTypes/Task2.kt
package dataTypesExercise2

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  // Can be combined:
  val a:String = string + int // write some examples
  val b:String = string+double // write some examples
  val c:String = string+character
  val d:String = string+boolean

  val d1: Double = int + double
  val d2: Double = double + int
  val s1: String = character + string
  val c1: Char = character + int
  println("The type that can be combined " +
    "with every other type using '+':")
  println("String")

  // Can't be combined:
//  val a1 = boolean + int  // write some examples
//  val b1 = double + int
//  val bb = boolean + boolean
}