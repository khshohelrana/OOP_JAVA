package ColorCodeRGB;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        int r,g,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1 for present and 0 for absent");
        System.out.print("Red: ");
        r=s.nextInt();
        System.out.print("Green: ");
        g=s.nextInt();
        System.out.print("Blue: ");
        b=s.nextInt();
        int c=((100*r)+(10*g)+b);
        System.out.println("\n");
        switch(c){
            case 100:
                System.out.println("Red");
                break;
            case 010:
                System.out.println("Green");
                break;
            case 001:
                System.out.println("Blue");
                break;
            case 110:
                System.out.println("Yellow");
                break;
            case 101:
                System.out.println("Magenta");
                break;
            case 011:
                System.out.println("Cyan");
                break;
            case 111:
                System.out.println("White");
                break;
            case 000:
                System.out.println("No color");
                break;
            default:
                System.out.println("Your input is wrong");
        }

    }
}
