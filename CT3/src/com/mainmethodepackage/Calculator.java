package com.mainmethodepackage;
import com.userdefinedpackage.*;

public class Calculator {

    public static void main(String[] args) {
        Calculate obj1 = new Calculate();
        System.out.println(obj1.Addition (10, 20));
        Calculate obj2 = new Calculate();
        System.out.println(obj2.Subtraction (360, 220));
        Calculate obj3 = new Calculate();
        System.out.println(obj3.multiplication (10, 20));
        Calculate obj4 = new Calculate();
        System.out.println(obj4.division (100, 20));
    }
}
