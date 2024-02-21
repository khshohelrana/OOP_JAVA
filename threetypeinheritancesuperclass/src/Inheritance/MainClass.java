package Inheritance;

public class MainClass {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.stuid();
        s1.prgname();
        s1.deptname();
        s1.Uniname();

        Teacher t1 = new Teacher();
        t1.techname();
        t1.deptname();
        t1.Uniname();

        Club c1 = new Club();
        c1.clubname();
        c1.Uniname();

    }
}
