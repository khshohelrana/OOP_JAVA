public class AgeOutOfRangeException extends Exception{
    int Age;
    AgeOutOfRangeException(int Age){

     this.Age=Age;

    }

   public String Show(){

      return "You are older than the requested age (25 years), you are: " +Age;
   }

}
