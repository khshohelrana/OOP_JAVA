package Package_LabTask_lab7;
import Math.*;
import java.util.Scanner;

public class LabTask_lab7 {

    public static void main(String[] args) {
        Addition a1 = new Addition();
        Subtraction a2 = new Subtraction();
        multiplication a3 = new multiplication();
        division a4 = new division();
        Scanner scan = new Scanner(System.in);
        int option;
        double a,b;
        do{
            System.out.println("1/ Addition");
            System.out.println("2/ Subtraction");
            System.out.println("3/ Multiplication");
            System.out.println("4/ Division");
            System.out.print("Enter your choice: ");
            option = scan.nextInt();
            switch (option){
                case 1: {
                    System.out.println("Enter 1st number whatever you want: ");
                    a = scan.nextDouble();
                    System.out.println("Enter 2nd number whatever you want: ");
                    b = scan.nextDouble();
                    double ans = a1.add(a,b);
                    System.out.println("Answer  = "+ans);
                    break;
                }
                case 2: {
                    System.out.println("Enter 1st number whatever you want: ");
                    a = scan.nextDouble();
                    System.out.println("Enter 2nd number whatever you want: ");
                    b = scan.nextDouble();
                    double ans = a2.sub(a,b);
                    System.out.println("Answer  = "+ans);
                    break;
                }
                case 3: {
                    System.out.println("Enter 1st number whatever you want: ");
                    a = scan.nextDouble();
                    System.out.println("Enter 2nd number whatever you want: ");
                    b = scan.nextDouble();
                    double ans = a3.multi(a,b);
                    System.out.println("Answer  = "+ans);
                    break;
                }
                case 4: {
                    System.out.println("Enter 1st number whatever you want: ");
                    a = scan.nextDouble();
                    System.out.println("Enter 2nd number whatever you want: ");
                    b = scan.nextDouble();
                    double ans = a4.div(a,b);
                    System.out.println("Sub  = "+ans);
                    break;
                }
                default:{
                    System.out.println("Please Enter correct option");
                    return;
                }
            }
        }while(option<=4);
    }

}




