import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int Age=scan.nextInt();
        System.out.print("Enter Your Gpa: ");
        double Gpa=scan.nextDouble();


        try{
            if(Age>25){

            throw new AgeOutOfRangeException(Age);

           }
            else{
            System.out.println("Age requirement is acceptable.");

                 }

        }catch (AgeOutOfRangeException e){

            System.out.println(e.Show());
        }


        try {
             if(2.5>Gpa){
              throw new LowGpaException();
             }

           else{

               if(Age<25){

                   System.out.println("Your application is accepted and is under study.");

               }
               else{
                 System.out.println("Requirement don't fulfil.");
}
           }
        }catch (LowGpaException e){

            System.out.println(e.Display());

        }

    }
}

