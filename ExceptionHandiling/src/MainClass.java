import java.util.Scanner;

public class MainClass {

    public static void main ( String[] args ) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter marks: ");
        double marks=scan.nextDouble();
        try{

            Test.compute(marks);
            //throw new InvalidMarksException(marks);

        }catch (InvalidMarksException e){

            System.out.println("caught"+e);

        }
    }
}
