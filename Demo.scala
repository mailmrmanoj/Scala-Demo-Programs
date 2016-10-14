//Credits: https://www.tutorialspoint.com/scala/scala_classes_objects.htm

//Steps to run scala code...
//1.Open cmd
//2.scalac Demo.scalac
//3.scala Demo
 
import java.io._
class Point (val a:Int,val b:Int) {
var x:Int=a;
var y:Int=b;

def move(first:Int,second:Int){
        x=x+first;
        y=y+second;
        println("Point a location : ",+x);
        println("Point b location : ",+y);
   }
}
object Demo {      //Note that the file name should be the same as the object name
def main(args:Array[String]){
            val testPoint=new Point(10,20);
            testPoint.move(20,40);
    }
}
