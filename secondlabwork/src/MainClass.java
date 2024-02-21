import java.util.Scanner;

public class MainClass {



    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter hight: ");
        double h= s.nextDouble();

        System.out.println("Enter your weight: ");
        double w= s.nextDouble();
        FirstClass s1= new FirstClass(0.5, h, w);
        System.out.println("Enter hight: ");
         h= s.nextDouble();
        FirstClass s2= new FirstClass( h );



        System.out.println("Enter hight: ");
         h= s.nextDouble();

        System.out.println("Enter your weight: ");
         w= s.nextDouble();
        FirstClass s3= new FirstClass(h,w);


    }

}


