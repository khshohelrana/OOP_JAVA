import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
//        java.io.File dir = new java.io.File("E:\\Java\\FileLabrepot");
//        dir.mkdir();
        File f1 = new File("E:\\Java\\FileLabrepot\\file1.txt");
        File f2 = new File("E:\\Java\\FileLabrepot\\file2.txt");
        File f3 = new File("E:\\Java\\FileLabrepot\\file3.txt");
        try {
            f1.createNewFile();
            f2.createNewFile();
            f3.createNewFile();
        } catch (IOException e) {
            System.out.println(e);

        }
        Scanner scan = new Scanner(System.in);
        int  m1, n1, m2, n2;
        int[][] mat1 = new int[20][20];
        int[][] mat2 = new int[20][20];
        int[][] mull = new int[20][20];
        System.out.print("Enter rows number: ");
        m1 = scan.nextInt();
        System.out.print("Enter columns number: ");
        n1 = scan.nextInt();
        try {

            Formatter formater = new Formatter("E:\\Java\\FileLabrepot\\file1.txt");
            System.out.println();
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {

                    System.out.printf("Enter matrix elements 1[%d][%d]: ", i, j);
                    mat1[i][j] = scan.nextInt();
                    formater.format("%d", mat1[i][j]);
                }
                formater.format("\r\n");
            }
            formater.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println();
        System.out.print("Enter rows number: ");
        m2 = scan.nextInt();
        System.out.print("Enter columns number: ");
        n2 = scan.nextInt();
        System.out.println();
        try {
            Formatter formater = new Formatter("E:\\Java\\FileLabrepot\\file2.txt");
            if (m1 == n2) {

                for (int i = 0; i < m2; i++) {
                    for (int j = 0; j < n2; j++) {

                        System.out.printf("Enter matrix elements 2[%d][%d]: ", i, j);
                        mat2[i][j] = scan.nextInt();
                        formater.format("%d", mat2[i][j]);
                    }
                    formater.format("\r\n");
                }
                formater.close();


            } else {

                System.out.println("Multiplication not possible");

            }


        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        System.out.println();
        System.out.println("multiplication is: ");
        for(int i=0; i<m1; i++){

            for(int j=0; j<n2; j++){

                mull[i][j]=0;
                for(int z=0; z<m2; z++){

                    mull[i][j]+=mat1[i][z]*mat2[z][j];


                }

            }
        }

    try{
        Formatter formater = new Formatter("E:\\Java\\FileLabrepot\\file3.txt");

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {

                System.out.printf("%d\t ",mull[i][j]);

                formater.format("%d  ", mull[i][j]);
            }
            System.out.println();
            formater.format("\r\n");
        }
        formater.close();

    } catch (FileNotFoundException e) {
        System.out.println(e);
    }


    } }