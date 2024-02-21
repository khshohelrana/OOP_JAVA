import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int n, a=0, b=0,c=1;
        Scanner x=new Scanner(System.in);
        System.out.print("Enter a number whatever you want: ");
        n=x.nextInt();
        System.out.print("Fibonacci series:: ");
        for(int i=1; i<=n; i++)
        {   a=b;
            b=c;
            c=a+b;
            System.out.print(a+" ");

    }
}}
