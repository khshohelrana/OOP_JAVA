package SecondLabReport;

import java.util.Scanner;

public class MainClass {


    public static void main(String[] args) {

        int choice;
        do { System.out.println("1.Area of triangle");
        System.out.println("2.Area of rectangular");
        System.out.println("3.Area of circle");
        System.out.print("Enter your choice whatever you want: ");
        Scanner s=new Scanner(System.in);
         choice=s.nextInt();

            switch (choice) {

                case 1:
                    double b, h;
                    System.out.print("Enter base: ");
                    b = s.nextDouble();
                    System.out.print("Enter height: ");
                    h = s.nextDouble();
                    FirstClass c1 = new FirstClass(0.5, b, h);
                    break;
                case 2:
                    double l, w;
                    System.out.print("Enter Length: ");
                    l = s.nextDouble();
                    System.out.print("Enter width: ");
                    w = s.nextDouble();
                    FirstClass c2 = new FirstClass(l, w);

                    break;
                case 3:
                    double r;
                    System.out.print("Enter radius: ");
                    r = s.nextDouble();

                    FirstClass c3 = new FirstClass(r);
                    break;
                default:
                    System.out.println("Enter correct option");


            }
        }while(choice<=4);
    }
}
