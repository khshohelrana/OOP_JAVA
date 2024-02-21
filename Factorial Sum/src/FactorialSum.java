import java.util.Scanner;

public class FactorialSum {

    static int factorial(int numberinput) {
        if (numberinput == 0)
            return 1;
        else
            return (numberinput*factorial(numberinput-1));
    }

     static void sum(int numberinput) {
        int sum = 0;
        for (int i = 0; i <= numberinput; i++)
            sum += factorial(i);

        System.out.println("Summation of Factorial number:"+sum);
    }
    public static void main(String[] args) {

        int numberinput, s;
        Scanner p= new Scanner(System.in);
        System.out.print("Enter a number whatever you want: ");
        numberinput=p.nextInt();
        s=factorial(numberinput);
        System.out.println("Factorial of the number is:"+s);
        sum(numberinput);

    }
}
