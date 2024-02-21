package Inheritance;

public class ClassUniversity {

    public void Uniname(){
        System.out.println("University Name: Green University of Bangladesh");
    }

}



class Department extends ClassUniversity{

    public void deptname(){
        System.out.println("Department name: CSE ");
    }
}

class Program extends Department{
    public void prgname(){
        System.out.println("Program name: BSc in CSE");
    }
}


 class Student extends Program{
    public void stuid(){
        System.out.println("Student ID: 211902017");
    }
    public void prgname() {
        super.prgname();
        System.out.println("Program name: BSc in CSE");
    }
}


 class Teacher extends Department{
    public void techname(){
        System.out.println("Teacher name: Dr. Muhammad Aminur Rahaman");
    }
}

class Club extends ClassUniversity{

    public void clubname() {
        System.out.println("Club name: Computer club (gucc)");
    } }