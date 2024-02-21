package FirstCtPractice;

import java.util.Scanner;

public class MainClass {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a[][] = new int[3][4];
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                a[i][j]= scan.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int b[][] = new int[4][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                b[j][i]=a[i][j];
            }
        }
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

    }


}
