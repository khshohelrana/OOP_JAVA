package com.report;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) throws IOException {

        Scanner scan= new Scanner(System.in);
//        File f= new File("E:/Java/labreporthree/shohel.txt");
//        FileWriter fw=new FileWriter("shohel");
        FileReader fr=new FileReader("E:\\Java\\labreporthree\\sadikka.txt");


//     fw.write("shohel rana");
//
//
//       String n= scan.nextLine();
//        fw.write(n);
//        fw.close();
int c;
        while((c=fr.read())!= -1){

            System.out.print((char)c);
        }
        fr.close();



       // System.out.println("program is ok!");


    }}
