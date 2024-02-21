import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n, i, count = 0;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a Number:");
        n = x.nextInt();
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("This is a prime Number");
        } else {
            System.out.println("THis is not a Prime Number");
        }
    }
}
