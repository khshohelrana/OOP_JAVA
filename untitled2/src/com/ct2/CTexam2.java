package com.ct2;

import java.util.Scanner;

class Fraction{

    int numerator , denominator;
    Fraction(int a, int b){

               numerator= a;
                denominator=b;

    }
    Fraction(){
            numerator=1;
                denominator=1;

    }
    double instance(){
        Scanner s= new Scanner(System.in);
       int y,z;
 y=s.nextInt();
 z=s.nextInt();

 return (this.numerator*y)/(this.denominator*z);


    }

}

public class CTexam2 {
    public static void main(String[] args) {
        Fraction x= new Fraction(2,3) ;
     double st= x.instance();
        System.out.println(st);
    }

}
