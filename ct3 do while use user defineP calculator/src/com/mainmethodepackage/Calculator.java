package com.mainmethodepackage;
import com.userdefinedpackage.*;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Calculate a1 = new Calculate();
        Calculate a2 = new Calculate();
        Calculate a3 = new Calculate();
        Calculate a4 = new Calculate();
        Scanner scan = new Scanner(System.in);
        int option;
        int a,b;
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
                    a = scan.nextInt();
                    System.out.println("Enter 2nd number whatever you want: ");
                    b = scan.nextInt();
                    int ans = a1.add(a,b);
                    System.out.println("Answer  = "+ans);
                    break;
                }
                case 2: {
                    System.out.println("Enter 1st number whatever you want: ");
                    a = scan.nextInt();
                    System.out.println("Enter 2nd number whatever you want: ");
                    b = scan.nextInt();
                    int ans = a2.sub(a,b);
                    System.out.println("Answer  = "+ans);
                    break;
                }
                case 3: {
                    System.out.println("Enter 1st number whatever you want: ");
                    a = scan.nextInt();
                    System.out.println("Enter 2nd number whatever you want: ");
                    b = scan.nextInt();
                    int ans = a3.multi(a,b);
                    System.out.println("Answer  = "+ans);
                    break;
                }
                case 4: {
                    System.out.println("Enter 1st number whatever you want: ");
                    a = scan.nextInt();
                    System.out.println("Enter 2nd number whatever you want: ");
                    b = scan.nextInt();
                    int ans = a4.div(a,b);
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
