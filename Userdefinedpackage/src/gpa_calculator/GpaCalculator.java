package gpa_calculator;

public class GpaCalculator {

    public void Calculator(double a) {


            if (a >= 0.00 && a <= 100) {

                if (a >= 80.00 && a <= 100) {
                    System.out.println("You got GPA: 4.00");
                }

                if (a >= 75.00 && a < 80.00) {
                    System.out.println("You got GPA: 3.75");
                }
                if (a >= 70.00 && a < 75.00) {
                    System.out.println("You got GPA: 3.50");
                }
                if (a >= 65.00 && a < 70.00) {
                    System.out.println("You got GPA: 3.25");
                }
                if (a >= 60.00 && a < 65.00) {
                    System.out.println("You got GPA: 3.00");
                }
                if (a >= 55.00 && a < 60.00) {
                    System.out.println("You got GPA: 2.75");
                }
                if (a >= 50.00 && a < 55.00) {
                    System.out.println("You got GPA: 2.50");
                }
                if (a >= 45.00 && a < 50.00) {
                    System.out.println("You got GPA: 2.25");
                }
                if (a >= 40.00 && a < 45.00) {
                    System.out.println("You got GPA: 2.00");
                }
                if (a >= 0.00 && a < 40.00) {
                    System.out.println("Fail");

                }

            } else {
                System.out.println("Invalid  Input");
            }

    }}
