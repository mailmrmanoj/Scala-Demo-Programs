package algorithms

/**
 * Created by manoj on 10/19/2016.
 */
object LinearSearch extends App {
  val arrayList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
  println("Enter the number to check if its present?");
  val read = readLine()
  val searchResult = linearSearch(arrayList, read.toInt)
  if (searchResult) println(read + " is present in " + arrayList) else println(read + " is not present in the list " + arrayList)

  def linearSearch(list: List[Int], key: Int): Boolean = {
    list.contains(key)
  }
}

object LinearSearchWithDynamicInput extends App {
  println("Enter array elements :");
  val inputElements = readLine()
  val transformedList = inputElements.split(" ").map(_.toInt)
  println("Entered input elements are :" + transformedList.toList)
  println("Enter the number to  be searched ?");
  val inputNumber = readLine()
  val searchResult = linearSearch(transformedList.toList, inputNumber.toInt)
  if (searchResult) println(inputNumber + " is present in " + transformedList.toList) else println(inputNumber + " is not present in the list " + transformedList.toList)
  def linearSearch(list: List[Int], key: Int): Boolean = {
    list.contains(key)
  }
}