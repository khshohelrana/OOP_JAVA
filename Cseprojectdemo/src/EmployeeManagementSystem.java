//import Java.io.File;
//import Java.io.FileInputStream;
//import Java.io.FileOutpotStream;
//import Java.io.IOException;
//import Java.io.ObjectInputStream;
//import Java.io.ObjectOutputStrea;
//import Java.io.Serializable;
//import Java.util.ArrayList;
//import Java.util.Scanner;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("Serial")
class Employee implements Serializable {
    int id;
    String name;
    float salary;
    long contact;
    String email;


    public Employee(int id,  String name, float salary, long contact, String email ){

        this.id=id;
        this.name=name;
        this.salary=salary;
        this.email=email;
        this.contact=contact;

    }
    public String toString(){

        return "\nEmployee Details: "+"\nID: "+ this.id+ "\nName: "+this.name+"\nSalary: "+
                this.salary+"\nContact No: "+ this.contact+"\nEmail No: "+this.email;


    }

        }





public class EmployeeManagementSystem {

    static void display(ArrayList<Employee>al){
        System.out.println("\n--------------------------------Employee List---------------------------");
        System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s","ID","Name","Salary","Contact","Email") );
        for(Employee e:al){
            System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s",e.id, e.name, e.salary, e.contact,e.email));
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int id;
        String name;
        float salary;
        long contact;
        String email;

        Scanner sc=new Scanner( System.in);
        ArrayList<Employee>al= new ArrayList<Employee>();

        File f =null;
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try{
            f=new File("E:\\Java\\Cseprojectdemo\\src\\filedatabase.txt");
            if(f.exists()){

            fis=new FileInputStream(f);
            ois=new ObjectInputStream(fis);
            al=(ArrayList<Employee>) ois.readObject();
            }
        }
        catch (Exception exp){
            System.out.println(exp);
        }
        do{

            System.out.println("1.Add Employee's information \n"+
                                "2.Search Employee's information\n"+
                                 "3.Update Employee's information\n"+
                                 "4.Delete Employee's information\n"+
                                 "5.Display Employee's information List\n"+
                                  "6.Exit\n");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the following details");
                    System.out.print("Enter ID: ");
                    id= sc.nextInt();
                    System.out.print("Enter Name: ");
                    sc.nextLine();
                    name=sc.nextLine();
                    System.out.print("Enter Salary: ");
                    salary=sc.nextFloat();
                    System.out.print("Enter Contact No: ");
                    contact=sc.nextLong();
                    System.out.print("Enter Email No: ");
                    email=sc.next();
                    al.add(new Employee(id,name,salary,contact,email));
                    display(al);
                    break;
                case 2:
                    System.out.println("Enter the Employee's Id to Search: ");
                    id=sc.nextInt();
                    int i=0;
                    for(Employee e: al){
                        if (id==e.id){
                            System.out.println(e+"\n");
                            i++;

                        }

                    }
                if(i==0){
                    System.out.println("\nEmployee's details are not Available,Enter valid ID");

                }
                break;
                case 3:
                    System.out.println("\nEnter Employee's ID to Update the details: ");
                    id=sc.nextInt();
                    int j=0;
                    for(Employee e: al){



                        if(id==e.id){
                            System.out.print("Enter Name: ");
                           sc.nextLine();
                            e.name=sc.nextLine();
                           // System.out.println(e+"\n");
                            System.out.print("Enter Salary: ");
                            e.salary=sc.nextFloat();
                            //System.out.println(e+"\n");
                            System.out.print("Enter Contact No: ");
                            e.contact=sc.nextLong();
                           // System.out.println(e+"\n");
                            System.out.print("Enter Email No: ");
                            e.email=sc.next();
                           // System.out.println(e+"\n");
                            j++;

                        }
                    }
                    if (j==0) {

                        System.out.println("\nEmployee's details are not Available,Enter valid ID");
                    }
                break;
                case 4:
                    System.out.println("\nEnter Employee's ID to Delete the details from Database");
                    id=sc.nextInt();
                    int k=0;
                    try {
                        for (Employee e : al) {
                            if (id == e.id) {

                                al.remove(e);
                                display(al);
                                k++;
                            }

                        }
                        if (k==0) {

                            System.out.println("\nEmployee's details are not Available,Enter valid ID");
                        }
                    }
                    catch (Exception ex){

                        System.out.println(ex);
                    }
                    break;

                case 5: try{

                   al=(ArrayList<Employee>) ois.readObject();
                }
                catch (ClassNotFoundException e2){

                    System.out.println(e2);

                }
                catch (Exception e2){
                    System.out.println(e2);
                }
                display(al);
                break;

                case 6: try{

                    fos=new FileOutputStream(f);
                    oos=new ObjectOutputStream(fos);
                    oos.writeObject(al);
                }
                catch (IOException e1){
                    e1.printStackTrace();
                }
                catch (Exception e2){

                    e2.printStackTrace();
                }
                finally {
                    try{
                        fis.close();
                        ois.close();
                        fos.close();
                        oos.close();
                    }
                    catch (Exception e1){

                        e1.printStackTrace();
                    }
                }
                    System.out.println("\nYou have chosen EXIT!!Saving Files and closing the tool");
                   sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("\n Please Enter correct choice");
                    break;
            }
        }while(true);
    }
}
