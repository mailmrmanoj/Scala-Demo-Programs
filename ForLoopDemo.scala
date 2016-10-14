

object ForLoopDemo extends App {
   
      var a = 0;
      
      // for loop execution with a range 
      for(a<- 1 to 10){
      println("Values of a:"+a);
      } 

      var arrayList=List(1,2,3,4,5,6,7,8,9);

      for(a <- arrayList){
      println("The new value is :" + a);
      }
   
}

object ForLoopYieldDemo extends App {
   
      var a = 0;         
      var arrayList=List(1,2,3,4,5,6,7,8,9);
      var retVal=for{a<-arrayList } yield a
      for(a <-retVal){
          println("Value of b:" + a);
       }
        
}
