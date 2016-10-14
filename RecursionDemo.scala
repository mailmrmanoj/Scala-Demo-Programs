object Recursion extends App{
def factorial(n:Int):Int={
if(n<=1)
    1
    else
    n*factorial(n-1) 
    }
println("Factorial:"+factorial(5));
for(i<-1 to  10){
println("Factorial:"+factorial(i));
     } 
}