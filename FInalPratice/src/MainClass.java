import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
;

public class MainClass {
    public static void main(String[] args) {

        File f1=new File("E:\\Java\\FInalPratice\\f1.txt");
        File f2=new File("E:\\Java\\FInalPratice\\f2.txt");
        File ans=new File("E:\\Java\\FInalPratice\\ans.txt");

        try{

            f1.createNewFile();
            f2.createNewFile();
            ans.createNewFile();


        }catch (Exception e){

            System.out.println(e);

        }

        Scanner scan=new Scanner(System.in);
        int r1,c1,r2,c2;
        int[][] mat1=new int [10][10];
        int[][] mat2=new int [10][10];
        int[][] mul =new int [10][10];
        System.out.println("Enter row number: ");
        r1= scan.nextInt();
        System.out.println("Enter column number: ");
        c1= scan.nextInt();
try{
    Formatter format=new Formatter("E:\\Java\\FInalPratice\\f1.txt");
    System.out.println();
for (int i=0; i<r1; i++){
    for (int j=0; j<c1;j++){
        System.out.printf("Enter matrix elements:1[%d][%d]",i,j);
      mat1[i][j]= scan.nextInt();
        format.format("%d", mat1[i][j]);

    }
    format.format("\r\n");

}format.close();


}catch (Exception e){

    System.out.println(e);
}
        System.out.println();
        System.out.println("Enter row number: ");
        r2= scan.nextInt();
        System.out.println("Enter column number: ");
        c2= scan.nextInt();
        try{
            Formatter format=new Formatter("E:\\Java\\FInalPratice\\f2.txt");
            if(r1==c2) {
                for (int i = 0; i < r2; i++) {
                    for (int j = 0; j < c2; j++) {
                        System.out.printf("Enter matrix elements:2[%d][%d]", i, j);
                        mat2[i][j] = scan.nextInt();
                        format.format("%d", mat2[i][j]);

                    }
                    format.format("\r\n");

                }
                format.close();
            }else
                System.out.println("Multiplication not possible");

        }catch (Exception e){

            System.out.println(e);
        }

        System.out.println("Answer is: ");
  for(int i=0; i<r1; i++){
      for(int j=0; j<c2; j++){
          mul[i][j]=0;
    for(int z=0; z<r2; z++)
        mul[i][j]=mul[i][j]+mat1[i][z]*mat2[z][j];

      }}
try{

    Formatter format=new Formatter("E:\\Java\\FInalPratice\\ans.txt");
    for (int i = 0; i < r1; i++) {
        for (int j = 0; j < c1; j++) {

            System.out.printf("%d\t ",mul[i][j]);

            format.format("%d  ", mul[i][j]);
        }
        System.out.println();
        format.format("\r\n");
    }
    format.close();


}catch (Exception e){
    System.out.println(e);
}

//       try{
//        Scanner myReader = new Scanner(ans);
//        while (myReader.hasNextInt()) {
//            int data = myReader.nextInt();
//            System.out.println(data);
//        }
//           myReader.close();
//        }
//        catch(Exception e){
//               System.out.println(e );}
       }


    }

