package algorithms

/**
 * Created by manoj on 10/19/2016.
 */
object ConvertStringCase extends App {
  println("Enter the string:")
  val stringToConvert = readLine()
  val result = stringToConvert.map { item =>
    if (item.isUpper) {
      item.toLower
    } else {
      item.toUpper
    }

  }

  println("Converted string :"+result)

}
