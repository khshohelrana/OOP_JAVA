package MainPackage;

import gpa_calculator.*;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        GpaCalculator ob= new GpaCalculator();
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter Your Mark: ");
        double mark=scan.nextDouble();
            ob.Calculator(mark);


    }

}
