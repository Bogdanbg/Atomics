// InKeyword/Task4.kt
package theInKeywordExercise4

// isValidCharacter

fun isValidIdentifier(s: String): Boolean {
  if (s.isEmpty()|| s[0] in '0'..'9') return false
  for(ch in  s){
    if (!isValidChar(ch)) return false
  }
  return true

}

fun isValidChar(ch: Char): Boolean = ch == '_' ||
        ch in 'a'..'z' ||
        ch in 'A'..'Z' ||
        ch in '0'..'9'
fun main() {
  println(isValidIdentifier("name"))  // true
  println(isValidIdentifier("0name"))  // false
}