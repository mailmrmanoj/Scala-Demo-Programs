package algorithms

/**
 * Created by manoj on 10/19/2016.
 */
object Palindrome extends App {
  val str = readLine()
  val result = checkPalindrome(str)
  if (result) {
    println("YES")
  } else {
    println("NO")
  }
  def checkPalindrome(str: String): Boolean = {
    if (str == str.reverse)
      true
    else
      false
  }
}

