import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.print("Enter a array size Whatever you want: ");
        size = input.nextInt();
        int [] number = new int[size];


        System.out.print("Enter integer Numbers: ");
        for(int i = 0; i < size; i++ )
        {
            number[i] = input.nextInt();
        }

        for(int i = 0;i < size; i++ )
        {
            if(number[i] % 2 ==0)
                System.out.println(number[i]+" is Even number.");

            else
                System.out.println(number[i]+" is Odd number.");

        }
    }

}
